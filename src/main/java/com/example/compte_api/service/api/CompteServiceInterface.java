package com.example.compte_api.service.api;

import com.example.compte_api.entity.Compte;

import java.util.List;
import java.util.Optional;

public interface CompteServiceInterface {

    List<Compte> getAllAccounts();
    Optional<Compte> findAccountById(Long id);
    void deleteAccountById(Long id);
    Compte addAccount(Compte compte);
}
