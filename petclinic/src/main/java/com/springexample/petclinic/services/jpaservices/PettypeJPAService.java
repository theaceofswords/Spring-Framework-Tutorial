package com.springexample.petclinic.services.jpaservices;

import com.springexample.petclinic.model.PetType;
import com.springexample.petclinic.repositories.PettypeRepository;
import com.springexample.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PettypeJPAService implements PetTypeService {

    private final PettypeRepository pettypeRepository;

    public PettypeJPAService(PettypeRepository pettypeRepository) {
        this.pettypeRepository = pettypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType>petTypes = new HashSet<>();
        pettypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
       return pettypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return pettypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        pettypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pettypeRepository.deleteById(aLong);
    }
}
