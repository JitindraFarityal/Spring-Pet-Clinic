package com.example.jitindra.SpringPetClinic.service;

import com.example.jitindra.SpringPetClinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
