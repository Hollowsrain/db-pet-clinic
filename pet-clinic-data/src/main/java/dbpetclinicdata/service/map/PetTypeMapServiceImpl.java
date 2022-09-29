package dbpetclinicdata.service.map;

import dbpetclinicdata.model.PetType;
import dbpetclinicdata.service.PetTypeService;

import java.util.Set;


public class PetTypeMapServiceImpl extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType entity) {
        return super.save(entity);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
