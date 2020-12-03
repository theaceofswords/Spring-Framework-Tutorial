package com.springexample.petclinic.repositories;

import com.springexample.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long>{
}
