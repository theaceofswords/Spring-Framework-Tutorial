package com.springexample.petclinic.services.jpaservices;

import com.springexample.petclinic.model.Owner;
import com.springexample.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerJPAService implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return null;
    }

    @Override
    public Owner findById(Long aLong) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public void delete(Owner object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Owner findByLastName(String name) {
        return null;
    }
}
