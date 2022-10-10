package dbpetclinicweb.repositories;

import dbpetclinicweb.model.PetType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("petTypeRepository")
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
