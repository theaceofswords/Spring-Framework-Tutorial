package com.springexample.petclinic.services.map;

import com.springexample.petclinic.model.VetSpeciality;
import com.springexample.petclinic.services.VetSpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetSpecialityMapServices extends AbstractMapService<VetSpeciality,Long> implements VetSpecialityService {
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
