package dbpetclinicdata.service.jpa;

import dbpetclinicdata.model.Speciality;
import dbpetclinicdata.repositories.SpecialityRepository;
import dbpetclinicdata.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("JPA")
public class SpecialityJPAService implements SpecialtyService {

    private final SpecialityRepository specialityRepository;

    public SpecialityJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElseThrow(() -> new RuntimeException("No speciality found by Id: " + aLong));
    }

    @Override
    public Speciality save(Speciality entity) {
        return specialityRepository.save(entity);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
