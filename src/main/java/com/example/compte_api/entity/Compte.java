package com.example.compte_api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;


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
    private String object;
    private LocalDate createdAt;
    private long number;
    private double balance;
    private String currency;
}