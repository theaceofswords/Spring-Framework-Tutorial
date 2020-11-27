package com.springexample.petclinic.bootstrap;

import com.springexample.petclinic.model.Owner;
import com.springexample.petclinic.model.Vet;
import com.springexample.petclinic.services.OwnerService;
import com.springexample.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(321L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Jackson");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(34234L);
        owner2.setFirstName("Greg");
        owner2.setLastName("S");
        ownerService.save(owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();
        vet1.setId(9499L);
        vet1.setFirstName("George");
        vet1.setLastName("M");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(998L);
        vet2.setFirstName("Robert");
        vet2.setLastName("Brown");
        vetService.save(vet2);
        System.out.println("Loaded Vets");
    }
}
