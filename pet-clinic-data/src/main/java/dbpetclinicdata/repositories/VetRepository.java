package dbpetclinicdata.repositories;

import dbpetclinicdata.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
