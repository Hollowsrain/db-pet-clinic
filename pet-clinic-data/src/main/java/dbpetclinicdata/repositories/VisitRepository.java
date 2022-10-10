package dbpetclinicdata.repositories;

import dbpetclinicdata.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
