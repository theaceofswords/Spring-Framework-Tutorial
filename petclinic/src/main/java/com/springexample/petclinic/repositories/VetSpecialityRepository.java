package com.springexample.petclinic.repositories;

import com.springexample.petclinic.model.VetSpeciality;
import org.springframework.data.repository.CrudRepository;

public interface VetSpecialityRepository extends CrudRepository<VetSpeciality,Long> {
}
