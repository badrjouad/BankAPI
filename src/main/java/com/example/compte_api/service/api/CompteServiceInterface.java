package com.example.compte_api.service.api;

import com.example.compte_api.entity.Compte;
import com.example.compte_api.dto.CompteDTO;

import java.util.List;
import java.util.Optional;

public interface CompteServiceInterface {

    List<CompteDTO> getAll();
    Optional<Compte> find(Long id);
    void delete(Long id) throws Exception;
    CompteDTO add(CompteDTO compteDTO);
    CompteDTO update(CompteDTO compteDTO);
}
