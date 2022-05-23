package com.example.compte_api.service.impl;

import com.example.compte_api.dao.CompteRepository;
import com.example.compte_api.entity.Compte;
import com.example.compte_api.dto.CompteDTO;
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

    @Autowired
    CompteMapper compteMapper;


    @Override
    public List<CompteDTO> getAll() {


        return  compteMapper.asCompteDTO(compteRepository.findAll());

    }

    @Override
    public Optional<Compte> find(Long id) {
        return compteRepository.findById(id);
    }

    @Override
    public void delete(Long id) throws Exception {

        Compte compte = compteRepository.getById(id) ;
        if (compte== null)
        {
            throw new Exception("Product not found");
        }
        compteRepository.delete(compte);
    }

    @Override
    public CompteDTO add(CompteDTO compteDTO) {


        Compte compte = compteMapper.asCompte(compteDTO);

        return  compteMapper.asCompteDTO(compteRepository.saveAndFlush(compte));
    }

    @Override
    public CompteDTO update(CompteDTO compteDTO) {
        CompteMapper compteMapper = Selma.builder(CompteMapper.class).build();

        Compte compte = compteMapper.asCompte(compteDTO);

        return  compteMapper.asCompteDTO(compteRepository.save(compte));
    }
}
