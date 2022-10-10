package dbpetclinicdata.repositories;

import dbpetclinicdata.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
