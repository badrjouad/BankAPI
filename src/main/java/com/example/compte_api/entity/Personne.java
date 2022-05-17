package com.example.compte_api.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "Personne")
public class Personne {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String dateNaissance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "compte_id", referencedColumnName = "id")
    private Compte compte;
}