package com.springexample.petclinic.services.map;

import com.springexample.petclinic.model.Owner;
import com.springexample.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long>implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);

    }

    @Override
    public Owner findByLastName(String name) {
        return null;
    }
}
