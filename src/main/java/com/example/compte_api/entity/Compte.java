package com.example.compte_api.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Compte {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
    private Personne person;
    private BigDecimal depotInitial;
    private BigDecimal encours;


}