package com.example.compte_api.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
public class Compte {
    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
    private Personne person;

    private BigDecimal depotInitial;
    private BigDecimal encours;


}