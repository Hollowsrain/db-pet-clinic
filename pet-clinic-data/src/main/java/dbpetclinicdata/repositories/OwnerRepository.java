package dbpetclinicdata.repositories;

import dbpetclinicdata.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
