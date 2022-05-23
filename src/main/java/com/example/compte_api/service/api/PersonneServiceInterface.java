package com.example.compte_api.service.api;

import com.example.compte_api.dto.PersonneDTO;
import com.example.compte_api.entity.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneServiceInterface  {

    List<PersonneDTO> getAll();
    Optional<Personne> find(Long id);
    void delete(Long id) throws Exception;
    PersonneDTO add(PersonneDTO personneDTO);
    PersonneDTO update(PersonneDTO personneDTO);
}
