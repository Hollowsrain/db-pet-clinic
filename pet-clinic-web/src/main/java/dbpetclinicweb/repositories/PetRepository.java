package dbpetclinicweb.repositories;

import dbpetclinicweb.model.Pet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("petRepository")
public interface PetRepository extends CrudRepository<Pet, Long> {
}
