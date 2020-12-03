package com.springexample.petclinic.services.jpaservices;

import com.springexample.petclinic.model.VetSpeciality;
import com.springexample.petclinic.repositories.VetSpecialityRepository;
import com.springexample.petclinic.services.VetSpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class VetVetSpecialityJPAService implements VetSpecialityService {
    private final VetSpecialityRepository vetSpecialityRepository;

    public VetVetSpecialityJPAService(VetSpecialityRepository vetSpecialityRepository) {
        this.vetSpecialityRepository = vetSpecialityRepository;
    }

    @Override
    public Set<VetSpeciality> findAll() {
        Set<VetSpeciality> vetSpecialities = new HashSet<>();
        vetSpecialityRepository.findAll().forEach(vetSpecialities::add);
        return vetSpecialities;
    }

    @Override
    public VetSpeciality findById(Long aLong) {
        return vetSpecialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public VetSpeciality save(VetSpeciality object) {
        return vetSpecialityRepository.save(object);
    }

    @Override
    public void delete(VetSpeciality object) {
        vetSpecialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetSpecialityRepository.deleteById(aLong);
    }
}
