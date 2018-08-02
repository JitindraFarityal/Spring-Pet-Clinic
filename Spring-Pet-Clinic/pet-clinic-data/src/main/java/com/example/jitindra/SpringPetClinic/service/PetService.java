package com.example.jitindra.SpringPetClinic.service;

import com.example.jitindra.SpringPetClinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
