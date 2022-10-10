package dbpetclinicweb.repositories;

import dbpetclinicweb.model.Owner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("ownerRepository")
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
