package com.example.compte_api.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class CompteDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
}
