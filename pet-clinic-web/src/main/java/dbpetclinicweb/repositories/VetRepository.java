package dbpetclinicweb.repositories;

import dbpetclinicweb.model.Vet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("vetRepository")
public interface VetRepository extends CrudRepository<Vet, Long> {
}
