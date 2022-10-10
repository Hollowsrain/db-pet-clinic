package dbpetclinicweb.configuration;

import dbpetclinicweb.service.*;
import dbpetclinicweb.service.map.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"MAP", "default"})
public class MAPConfiguration {

    @Bean
    PetService petService() {
        return new PetServiceMapImpl();
    }

    @Bean
    PetTypeService petTypeService() {
        return new PetTypeMapServiceImpl();
    }

    @Bean
    SpecialtyService specialtyService() {
        return new SpecialtyMapServiceImpl();
    }

    @Bean
    VetService vetService(@Qualifier("specialtyService") SpecialtyService specialtyService) {
        return new VetServiceMapImpl(specialtyService);
    }

    @Bean
    VisitService visitService() {
        return new VisitMapServiceImpl();
    }

    @Bean
    OwnerService ownerService(@Qualifier("petTypeService") PetTypeService petTypeService, @Qualifier("petService") PetService petService) {
        return new OwnerServiceMapImpl(petTypeService, petService);
    }
}
