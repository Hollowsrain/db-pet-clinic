package dbpetclinicweb.service.map;

import dbpetclinicweb.model.Visit;
import dbpetclinicweb.service.VisitService;

import java.util.Set;

public class VisitMapServiceImpl extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (isPetOrOwnerNull(visit)) {
            throw new RuntimeException("Invalid Visit object");
        } else return super.save(visit);
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

    private boolean isPetOrOwnerNull(Visit visit) {
        return visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null;
    }
}
