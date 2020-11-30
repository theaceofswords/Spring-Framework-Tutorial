package com.springexample.petclinic.bootstrap;

import com.springexample.petclinic.model.Owner;
import com.springexample.petclinic.model.Pet;
import com.springexample.petclinic.model.PetType;
import com.springexample.petclinic.model.Vet;
import com.springexample.petclinic.services.OwnerService;
import com.springexample.petclinic.services.PetTypeService;
import com.springexample.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Micheal");
        owner1.setLastName("Jackson");
        owner1.setAddress("123 abcde");
        owner1.setCity("Miami");
        owner1.setTelephone("123455667");
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Greg");
        owner2.setLastName("S");
        owner2.setAddress("456 ghijkl");
        owner2.setCity("Florida");
        owner2.setTelephone("987654321");
        ownerService.save(owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();

        vet1.setFirstName("George");
        vet1.setLastName("M");
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Robert");
        vet2.setLastName("Brown");
        vetService.save(vet2);
        System.out.println("Loaded Vets");

        PetType dog = new PetType();
        dog.setType("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setType("Cat");
        PetType savedCat = petTypeService.save(cat);
        System.out.println("Loaded Pets");

        Pet michealsPet = new Pet();
        michealsPet.setPetType(savedDog);
        michealsPet.setBirthdate(LocalDate.now());
        michealsPet.setOwner(owner1);
        michealsPet.setName("Bruno");
        owner1.getPets().add(michealsPet);

        Pet gregsPet = new Pet();
        gregsPet.setPetType(savedCat);
        gregsPet.setBirthdate(LocalDate.now());
        gregsPet.setName("Lucy");
        gregsPet.setOwner(owner2);
        owner2.getPets().add(gregsPet);

        ownerService.save(owner1);
        ownerService.save(owner2);





    }
}
