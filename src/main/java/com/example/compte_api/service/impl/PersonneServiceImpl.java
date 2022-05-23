package com.example.compte_api.service.impl;


import com.example.compte_api.dao.PersonneRespository;
import com.example.compte_api.dto.PersonneDTO;
import com.example.compte_api.entity.Personne;
import com.example.compte_api.mapper.CompteMapper;
import com.example.compte_api.mapper.PersonneMapper;
import com.example.compte_api.service.api.PersonneServiceInterface;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneServiceImpl implements PersonneServiceInterface {


    @Autowired
    PersonneRespository personneRespository;

    @Autowired
    PersonneMapper personneMapper;

    @Override
    public List<PersonneDTO> getAll() {


        return  personneMapper.asPersonneDTO(personneRespository.findAll());

    }

    @Override
    public Optional<Personne> find(Long id) {
        return  personneRespository.findById(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Personne personne = personneRespository.getById(id) ;
        if (personne== null)
        {
            throw new Exception("Product not found");
        }
        personneRespository.delete(personne);
    }

    @Override
    public PersonneDTO add(PersonneDTO personneDTO) {
        Personne personne = personneMapper.asPersonne(personneDTO);
        return  personneMapper.asPersonneDTO(personneRespository.saveAndFlush(personne));
    }

    @Override
    public PersonneDTO update(PersonneDTO personneDTO) {


        Personne personne = personneMapper.asPersonne(personneDTO);
        return  personneMapper.asPersonneDTO(personneRespository.save(personne));
    }
}
