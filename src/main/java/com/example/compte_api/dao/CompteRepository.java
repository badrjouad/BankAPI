package com.example.compte_api.dao;

import com.example.compte_api.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {



}
