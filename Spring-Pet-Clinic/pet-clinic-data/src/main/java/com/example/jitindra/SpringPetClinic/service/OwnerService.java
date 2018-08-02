package com.example.jitindra.SpringPetClinic.service;

import com.example.jitindra.SpringPetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
