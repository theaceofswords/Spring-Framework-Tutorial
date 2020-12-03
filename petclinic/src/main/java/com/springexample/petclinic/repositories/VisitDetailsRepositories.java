package com.springexample.petclinic.repositories;

import com.springexample.petclinic.model.VisitDetails;
import org.springframework.data.repository.CrudRepository;

public interface VisitDetailsRepositories extends CrudRepository<VisitDetails,Long> {
}
