package com.example.jitindra.SpringPetClinic.bootstrap;

import com.example.jitindra.SpringPetClinic.model.Owner;
import com.example.jitindra.SpringPetClinic.model.Vet;
import com.example.jitindra.SpringPetClinic.service.OwnerService;
import com.example.jitindra.SpringPetClinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Tony");
        owner1.setLastName("Stark");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Thor");
        owner2.setLastName("Stark");

        ownerService.save(owner2);

        System.out.println("Loaded owners......");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Oliver");
        vet1.setLastName("Hugh");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Mario");
        vet2.setLastName("Cario");

        vetService.save(vet2);

        System.out.println("Loaded vets .....");
    }
}
