package com.springexample.petclinic.repositories;

import com.springexample.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
    Owner findByNickName(String name);
}
