package com.example.compte_api.controller;


import com.example.compte_api.entity.Compte;
import com.example.compte_api.dto.CompteDTO;
import com.example.compte_api.service.api.CompteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounts")
public class CompteResources {


    @Autowired
    CompteServiceInterface compteServiceInterface;

    @GetMapping(value = "/home")
    public String helloWorld()
    {
        return "Hello home ";

    }

    @GetMapping
    public List<CompteDTO> getAll()
    {
        return compteServiceInterface.getAll();

    }

    @GetMapping("/{account_id}")
    private Optional<Compte> getById(@PathVariable("account_id") Long account_id)
    {
        return  compteServiceInterface.find(account_id);
    }


    @DeleteMapping("/{account_id}")
    private void delete(@PathVariable("account_id") Long account_id) throws Exception {
        compteServiceInterface.delete(account_id);
        ResponseEntity.status(HttpStatus.CREATED).body("account with ID" + account_id +"\t" +  " has been deleted with succeseffuly");
    }



    @PostMapping("/account")
    private CompteDTO save(@RequestBody CompteDTO compteDTO)
    {
        compteServiceInterface.add(compteDTO);
        return compteDTO;
    }

    @PutMapping("/account")
    private CompteDTO update(@RequestBody CompteDTO compteDTO)
    {
        compteServiceInterface.update(compteDTO);
        return compteDTO;
    }




}
