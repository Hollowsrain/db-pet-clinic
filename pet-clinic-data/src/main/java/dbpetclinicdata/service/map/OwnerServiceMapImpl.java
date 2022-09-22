package dbpetclinicdata.service.map;

import dbpetclinicdata.model.Owner;
import dbpetclinicdata.service.BaseService;

import java.util.Set;

public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements BaseService<Owner, Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
