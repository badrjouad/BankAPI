package com.example.compte_api.mapper;

import com.example.compte_api.dto.PersonneDTO;

import com.example.compte_api.entity.Personne;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface PersonneMapper {

     Personne asPersonne(PersonneDTO personneDTO);
     PersonneDTO asPersonneDTO(Personne Personne);
      List<PersonneDTO> asPersonneDTO(List<Personne> personnes);
}
