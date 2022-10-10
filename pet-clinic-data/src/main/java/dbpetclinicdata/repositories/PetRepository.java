package dbpetclinicdata.repositories;

import dbpetclinicdata.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
