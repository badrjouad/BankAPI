package com.example.compte_api.dao;

import com.example.compte_api.entity.Compte;
import com.example.compte_api.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonneRespository extends CrudRepository<Person,Long> {

    List<Person> findAll();

    Optional<Person> findById(Long id);
    void deleteById(Long id);
    Person save(Person person);
}
