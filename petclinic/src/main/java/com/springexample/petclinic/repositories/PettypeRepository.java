package com.springexample.petclinic.repositories;

import com.springexample.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PettypeRepository extends CrudRepository<PetType,Long> {
}
