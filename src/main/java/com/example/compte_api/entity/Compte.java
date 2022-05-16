package com.example.compte_api.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table(name = "COMPTE")
public class Compte {


    @Id
    private Long id;
    private String accountNumber;
    private LocalDate createdAt;




}