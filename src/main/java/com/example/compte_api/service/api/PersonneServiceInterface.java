package com.example.compte_api.service.api;

import com.example.compte_api.dao.PersonneRespository;
import com.example.compte_api.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface PersonneServiceInterface  {

    List<Person> getAllPersons();
    Optional<Person> finPersonById(Long id);
    void deletePersonById(Long id);
    Person addPerson(Person person);
}
