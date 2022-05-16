package com.example.compte_api.controller;


import com.example.compte_api.entity.Compte;
import com.example.compte_api.service.api.CompteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compte")
public class CompteResources {


    @Autowired
    CompteServiceInterface compteServiceInterface;

    @GetMapping(value = "/hello")
    public String helloWorld()
    {
        return "Hello world";

    }

    @GetMapping(value = "/accounts")
    public List<Compte> getAll ()
    {
        return compteServiceInterface.getAllAccounts();

    }

    @GetMapping("/account/{account_id}")
    private Optional<Compte> getById(@PathVariable("account_id") Long account_id)
    {
        return  compteServiceInterface.findAccountById(account_id);
    }


    @DeleteMapping("/account/{account_id}")
    private void delete(@PathVariable("account_id") Long account_id)
    {
        compteServiceInterface.deleteAccountById(account_id);
        ResponseEntity.status(HttpStatus.CREATED).body("account with ID" + account_id +"\t" +  " has been deleted with succeseffuly");
    }



    @PostMapping("/account")
    private Compte save(@RequestBody Compte compte)
    {
        compteServiceInterface.addAccount(compte);
        return compte;
    }




}