package com.springexample.petclinic.bootstrap;

import com.springexample.petclinic.model.*;
import com.springexample.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final VetSpecialityService vetSpecialityService;
    private final VisitService visitService;

    public DataInitializer(OwnerService ownerService, VetService vetService,
                           PetTypeService petTypeService, VetSpecialityService vetSpecialityService,
                           VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.vetSpecialityService = vetSpecialityService;

        this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {
        initializer();
        System.out.println("initializing completed");


    }

    private void initializer() {
        Owner owner1 = new Owner();

        owner1.setFirstName("Micheal");
        owner1.setLastName("Jackson");
        owner1.setAddress("123 abcde");
        owner1.setCity("Miami");
        owner1.setTelephone("123455667");
        owner1.setNickName("white");
        ownerService.save(owner1);
        System.out.println(ownerService.findByNickName("white").getFirstName());
       // System.out.println(ownerService.findByLastName("Jackson").getFirstName());
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
        vet1.setTelephone("55555555");
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Robert");
        vet2.setLastName("Brown");
        vet2.setTelephone("464646464");
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

        VisitDetails visitor1 = new VisitDetails();
        visitor1.setPet(michealsPet);
        visitor1.setDescription("Teeth inspection");
        visitor1.setLocalDate(LocalDate.now());

        VisitDetails visitor2 = new VisitDetails();
        visitor2.setPet(gregsPet);
        visitor2.setLocalDate(LocalDate.now());
        visitor2.setDescription("Grooming");

        VetSpeciality radiology = new VetSpeciality();
        radiology.setDescription("Radiology");
        VetSpeciality save1 = vetSpecialityService.save(radiology);

        VetSpeciality dentistry = new VetSpeciality();
        dentistry.setDescription("Dentistry");
        VetSpeciality save2 = vetSpecialityService.save(dentistry);
        VetSpeciality surgery = new VetSpeciality();
        surgery.setDescription("Surgery");
        VetSpeciality save3 = vetSpecialityService.save(surgery);


        vet1.getSpecialities().add(save1);
        vet2.getSpecialities().add(save2);
        vet2.getSpecialities().add(save3);
        System.out.println("Specialities Loaded");
    }
}
