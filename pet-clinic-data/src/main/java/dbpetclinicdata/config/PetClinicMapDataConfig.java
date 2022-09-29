package dbpetclinicdata.config;

import dbpetclinicdata.service.OwnerService;
import dbpetclinicdata.service.PetService;
import dbpetclinicdata.service.PetTypeService;
import dbpetclinicdata.service.VetService;
import dbpetclinicdata.service.map.OwnerServiceMapImpl;
import dbpetclinicdata.service.map.PetServiceMapImpl;
import dbpetclinicdata.service.map.PetTypeServiceImpl;
import dbpetclinicdata.service.map.VetServiceMapImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"MAP", "default"})
public class PetClinicMapDataConfig {

    @Bean
     OwnerService ownerService(){
        return new OwnerServiceMapImpl();
    }

    @Bean
    PetService petService(){
        return new PetServiceMapImpl();
    }

    @Bean
    VetService vetService(){
        return new VetServiceMapImpl();
    }

    @Bean
    PetTypeService petTypeService(){
        return new PetTypeServiceImpl();
    }


}
