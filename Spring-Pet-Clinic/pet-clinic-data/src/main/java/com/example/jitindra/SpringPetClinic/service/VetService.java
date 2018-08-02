package com.example.jitindra.SpringPetClinic.service;

import com.example.jitindra.SpringPetClinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
