package dbpetclinicdata.service.map;

import dbpetclinicdata.model.Visit;
import dbpetclinicdata.service.VisitService;

import java.util.Set;

public class VisitMapServiceImpl extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit entity) {
        return super.save(entity);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }
}
