package com.example.compte_api.entity.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
public class CompteDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
}
