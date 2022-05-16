package com.example.compte_api.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "Personne")
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String dateNaissance;
}