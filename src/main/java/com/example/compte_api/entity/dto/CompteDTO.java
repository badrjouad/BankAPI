package com.example.compte_api.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompteDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
}
