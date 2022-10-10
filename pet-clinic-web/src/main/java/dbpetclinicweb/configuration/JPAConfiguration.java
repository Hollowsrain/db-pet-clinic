package dbpetclinicweb.configuration;

import dbpetclinicweb.repositories.*;
import dbpetclinicweb.service.*;
import dbpetclinicweb.service.jpa.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("JPA")
public class JPAConfiguration {

    @Bean
    OwnerService ownerService(@Qualifier("ownerRepository") OwnerRepository ownerRepository) {
        return new OwnerJPAService(ownerRepository);
    }

    @Bean
    PetService petService(@Qualifier("petRepository") PetRepository petRepository) {
        return new PetJPAService(petRepository);
    }

    @Bean
    PetTypeService petTypeService(@Qualifier("petTypeRepository") PetTypeRepository petTypeRepository) {
        return new PetTypeJPAService(petTypeRepository);
    }

    @Bean
    SpecialtyService specialtyService(@Qualifier("specialityRepository") SpecialityRepository specialityRepository) {
        return new SpecialityJPAService(specialityRepository);
    }

    @Bean
    VetService vetService(@Qualifier("vetRepository") VetRepository vetRepository) {
        return new VetJPAService(vetRepository);
    }

    @Bean
    VisitService visitService(@Qualifier("visitRepository") VisitRepository visitRepository) {
        return new VisitsJPAService(visitRepository);
    }


}
