package com.springexample.petclinic.services.map;

import com.springexample.petclinic.model.VetSpeciality;
import com.springexample.petclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesMapServices extends AbstractMapService<VetSpeciality,Long> implements SpecialitiesService {
    @Override
    public Set<VetSpeciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(VetSpeciality object) {
        super.delete(object);
    }

    @Override
    public VetSpeciality save(VetSpeciality object) {
        return super.save(object);
    }

    @Override
    public VetSpeciality findById(Long id) {
        return super.findById(id);
    }
}
