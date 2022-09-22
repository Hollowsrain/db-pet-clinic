package dbpetclinicdata.service.map;

import dbpetclinicdata.model.Pet;
import dbpetclinicdata.service.BaseService;

import java.util.Set;

public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements BaseService<Pet, Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}