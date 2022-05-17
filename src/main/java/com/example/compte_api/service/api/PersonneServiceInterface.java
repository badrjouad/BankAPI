package com.example.compte_api.service.api;

import com.example.compte_api.entity.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneServiceInterface  {

    List<Personne> getAllPersons();
    Optional<Personne> finPersonById(Long id);
    void deletePersonById(Long id);
    Personne addPerson(Personne person);
}
