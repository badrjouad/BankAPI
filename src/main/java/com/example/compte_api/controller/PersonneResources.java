package com.example.compte_api.controller;
import com.example.compte_api.entity.Personne;
import com.example.compte_api.service.api.PersonneServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/personnes")
public class PersonneResources {


    @Autowired
    PersonneServiceInterface personneServiceInterface;

    @GetMapping(value = "/hello")
    public String helloWorld()
    {
        return "Hello world";

    }


    @GetMapping(value = "/")
    public List<Personne> getAll ()
    {
        return personneServiceInterface.getAllPersons();

    }

    @GetMapping("/{personne_id}")
    private Optional<Personne> getById(@PathVariable("personne_id") Long personne_id)
    {
        return  personneServiceInterface.finPersonById(personne_id);
    }


    @DeleteMapping("/{personne_id}")
    private void delete(@PathVariable("personne_id") Long personne_id)
    {
        personneServiceInterface.deletePersonById(personne_id);
    }



    @PostMapping("/personne")
    private Personne save(@RequestBody Personne person)
    {
        personneServiceInterface.addPerson(person);
        return person;
    }
}
