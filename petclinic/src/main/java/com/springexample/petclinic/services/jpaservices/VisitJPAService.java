package com.springexample.petclinic.services.jpaservices;

import com.springexample.petclinic.model.VisitDetails;
import com.springexample.petclinic.repositories.VisitDetailsRepositories;
import com.springexample.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitJPAService implements VisitService {
    private final VisitDetailsRepositories visitDetailsRepositories;

    public VisitJPAService(VisitDetailsRepositories visitDetailsRepositories) {
        this.visitDetailsRepositories = visitDetailsRepositories;
    }

    @Override
    public Set<VisitDetails> findAll() {
        Set<VisitDetails> visitDetails = new HashSet<>();
        visitDetailsRepositories.findAll().forEach(visitDetails::add);
        return visitDetails;
    }

    @Override
    public VisitDetails findById(Long aLong) {
        return visitDetailsRepositories.findById(aLong).orElse(null);
    }

    @Override
    public VisitDetails save(VisitDetails object) {
        return visitDetailsRepositories.save(object);
    }

    @Override
    public void delete(VisitDetails object) {
        visitDetailsRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitDetailsRepositories.deleteById(aLong);
    }
}
