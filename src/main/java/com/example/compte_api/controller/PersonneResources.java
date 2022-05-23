package com.example.compte_api.controller;
import com.example.compte_api.dto.PersonneDTO;
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


    @GetMapping
    public List<PersonneDTO> getAll ()
    {
        return personneServiceInterface.getAll();

    }

    @GetMapping("/{personne_id}")
    private Optional<Personne> getById(@PathVariable("personne_id") Long personne_id)
    {
        return  personneServiceInterface.find(personne_id);
    }


    @DeleteMapping("/{personne_id}")
    private void delete(@PathVariable("personne_id") Long personne_id) throws Exception {
        personneServiceInterface.delete(personne_id);
    }



    @PostMapping("/personne")
    private PersonneDTO save(@RequestBody PersonneDTO personneDTO)
    {
        personneServiceInterface.add(personneDTO);
        return personneDTO;
    }

    @PutMapping("/personne")
    private PersonneDTO update(@RequestBody PersonneDTO personneDTO)
    {
        personneServiceInterface.update(personneDTO);
        return personneDTO;
    }
}
