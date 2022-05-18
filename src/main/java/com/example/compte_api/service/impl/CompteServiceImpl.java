package com.example.compte_api.service.impl;

import com.example.compte_api.dao.CompteRepository;
import com.example.compte_api.entity.Compte;
import com.example.compte_api.entity.dto.CompteDTO;
import com.example.compte_api.mapper.CompteMapper;
import com.example.compte_api.service.api.CompteServiceInterface;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteServiceImpl implements CompteServiceInterface {

    @Autowired
    CompteRepository compteRepository;



    @Override
    public List<CompteDTO> getAllAccounts() {
        //Build Product Mapper
        CompteMapper compteMapper = Selma.builder(CompteMapper.class).build();

        //Clone Result list of Entity product  to list of product Dto and retutn it
        return  compteMapper.asCompteDTO(compteRepository.findAll());

    }

    @Override
    public Optional<Compte> findAccountById(Long id) {
        return compteRepository.findById(id);
    }

    @Override
    public void deleteAccountById(Long id) {
        compteRepository.deleteById(id);
    }

    @Override
    public Compte addAccount(Compte compte) {
        return compteRepository.save(compte);
    }
}
