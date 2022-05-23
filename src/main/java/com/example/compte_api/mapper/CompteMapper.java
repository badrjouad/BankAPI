package com.example.compte_api.mapper;

import java.util.List;


import com.example.compte_api.entity.Compte;
import com.example.compte_api.dto.CompteDTO;
import fr.xebia.extras.selma.*;

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface   CompteMapper {

   Compte asCompte(CompteDTO compteDTO);
   CompteDTO asCompteDTO(Compte compte);
   List<CompteDTO> asCompteDTO(List<Compte> comptes);
}
