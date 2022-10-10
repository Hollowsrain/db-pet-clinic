package dbpetclinicweb.repositories;

import dbpetclinicweb.model.Visit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("visitRepository")
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
