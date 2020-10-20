package mogee.springframework.velspetclinic.bootstrap;

import mogee.springframework.velspetclinic.model.Owner;
import mogee.springframework.velspetclinic.model.Vet;
import mogee.springframework.velspetclinic.services.OwnerService;
import mogee.springframework.velspetclinic.services.VetService;
import mogee.springframework.velspetclinic.services.map.OwnerServiceMap;
import mogee.springframework.velspetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {
    OwnerService ownerService;
    VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("FOwnerOne");
        owner1.setLastName("LOwnerOne");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("FOwnerTwo");
        owner2.setLastName("LOwnerTwo");
        ownerService.save(owner1);

        System.out.println("Owners Loaded");

        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("FVetOne");
        vet1.setLastName("LVetOne");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("FVetTwo");
        vet2.setLastName("LVetTwo");
        vetService.save(vet2);

        System.out.println("Vets Loaded");
    }
}
