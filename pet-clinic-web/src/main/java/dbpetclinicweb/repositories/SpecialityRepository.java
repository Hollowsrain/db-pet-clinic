package dbpetclinicweb.repositories;

import dbpetclinicweb.model.Speciality;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

@Qualifier("specialityRepository")
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
