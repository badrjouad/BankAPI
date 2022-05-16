package com.example.compte_api.service.impl;


import com.example.compte_api.dao.PersonneRespository;
import com.example.compte_api.entity.Person;
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
    public List<Person> getAllPersons() {
        return personneRespository.findAll();
    }

    @Override
    public Optional<Person> finPersonById(Long id) {
        return  personneRespository.findById(id);
    }

    @Override
    public void deletePersonById(Long id) {
        personneRespository.deleteById(id);
    }

    @Override
    public Person addPerson(Person person) {
        return personneRespository.save(person);
    }
}
