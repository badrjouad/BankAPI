package com.example.compte_api.dao;

import com.example.compte_api.entity.Compte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CompteRepository extends CrudRepository<Compte,Long> {

    List<Compte> findAll();
    Optional<Compte> findById(Long id);
    void deleteById(Long id);
    Compte save(Compte compte);

}
