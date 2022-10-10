package dbpetclinicweb.service.jpa;

import dbpetclinicweb.model.Visit;
import dbpetclinicweb.repositories.VisitRepository;
import dbpetclinicweb.service.VisitService;

import java.util.HashSet;
import java.util.Set;


public class VisitsJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitsJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElseThrow(() -> new RuntimeException("No visit found by Id: " + aLong));
    }

    @Override
    public Visit save(Visit entity) {
        return visitRepository.save(entity);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
