package com.example.compte_api.service.impl;


import com.example.compte_api.dao.PersonneRespository;
import com.example.compte_api.entity.Personne;
import com.example.compte_api.service.api.PersonneServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneServiceImpl implements PersonneServiceInterface {


    @Autowired
    PersonneRespository personneRespository;

    @Override
    public List<Personne> getAllPersons() {
        return personneRespository.findAll();
    }

    @Override
    public Optional<Personne> finPersonById(Long id) {
        return  personneRespository.findById(id);
    }

    @Override
    public void deletePersonById(Long id) {
        personneRespository.deleteById(id);
    }

    @Override
    public Personne addPerson(Personne person) {
        return personneRespository.save(person);
    }
}
