package com.springexample.petclinic.services;

import com.springexample.petclinic.model.Owner;

public interface OwnerService extends CrudServices<Owner,Long> {
    Owner findByLastName(String name);

}
