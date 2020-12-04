package com.springexample.petclinic.services.map;

import com.springexample.petclinic.model.Owner;
import com.springexample.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner,Long>implements OwnerService {

//    private final PetTypeService petTypeService;
//    private final PetService petService;
//
//    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
//        this.petTypeService = petTypeService;
//        this.petService = petService;
//    }

    @Override
    public Set<Owner> findAll() {
        System.out.println("finding");
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("deleting owner");
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        System.out.println("deleting owner");
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        System.out.println("Savig owner");
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        System.out.println("finding by id");
        return super.findById(id);

    }

    @Override
    public Owner findByLastName(String name) {
        System.out.println("finding by lastname");
        return this.findAll().stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(name))
                .findFirst().orElse(null);

    }

    @Override
    public Owner findByNickName(String name) {
        return null;
    }


}
