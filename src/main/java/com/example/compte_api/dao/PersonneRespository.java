package com.example.compte_api.dao;

import com.example.compte_api.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonneRespository extends JpaRepository<Personne,Long> {


}
