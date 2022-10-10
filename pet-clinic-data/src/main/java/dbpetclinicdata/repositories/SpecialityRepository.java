package dbpetclinicdata.repositories;

import dbpetclinicdata.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
