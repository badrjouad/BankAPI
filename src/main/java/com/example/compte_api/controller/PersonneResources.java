package com.example.compte_api.controller;
import com.example.compte_api.entity.Person;
import com.example.compte_api.service.api.PersonneServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/person")
public class PersonneResources {


    @Autowired
    PersonneServiceInterface personneServiceInterface;

    @GetMapping(value = "/hello")
    public String helloWorld()
    {
        return "Hello world";

    }


    @GetMapping(value = "/list")
    public List<Person> getAll ()
    {
        return personneServiceInterface.getAllPersons();

    }

    @GetMapping("/personne/{personne_id}")
    private Optional<Person> getById(@PathVariable("personne_id") Long personne_id)
    {
        return  personneServiceInterface.finPersonById(personne_id);
    }


    @DeleteMapping("/personne/{personne_id}")
    private void delete(@PathVariable("personne_id") Long personne_id)
    {
        personneServiceInterface.deletePersonById(personne_id);
    }



    @PostMapping("/personne")
    private Person save(@RequestBody Person person)
    {
        personneServiceInterface.addPerson(person);
        return person;
    }
}
