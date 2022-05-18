package com.example.compte_api.dao;

import com.example.compte_api.entity.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonneRespository extends CrudRepository<Personne,Long> {

    List<Personne> findAll();
    Optional<Personne> findById(Long id);
    void deleteById(Long id);
    Personne save(Personne person);
}
