package com.springexample.petclinic.services;

import com.springexample.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String name);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
