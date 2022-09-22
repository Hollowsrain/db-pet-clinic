package dbpetclinicdata.service.map;

import dbpetclinicdata.model.Vet;
import dbpetclinicdata.service.BaseService;

import java.util.Set;

public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements BaseService<Vet, Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}