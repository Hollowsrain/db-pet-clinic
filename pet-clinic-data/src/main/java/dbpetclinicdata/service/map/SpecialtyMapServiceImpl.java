package dbpetclinicdata.service.map;

import dbpetclinicdata.model.Speciality;
import dbpetclinicdata.service.SpecialtyService;

import java.util.Set;

public class SpecialtyMapServiceImpl extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality entity) {
        return super.save(entity);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
}
