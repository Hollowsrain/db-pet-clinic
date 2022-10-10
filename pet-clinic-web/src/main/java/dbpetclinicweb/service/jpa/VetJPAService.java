package dbpetclinicweb.service.jpa;

import dbpetclinicweb.model.Vet;
import dbpetclinicweb.repositories.VetRepository;
import dbpetclinicweb.service.VetService;

import java.util.HashSet;
import java.util.Set;


public class VetJPAService implements VetService {

    private final VetRepository vetRepository;

    public VetJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElseThrow(() -> new RuntimeException("Can't find vet by id: " + aLong));
    }

    @Override
    public Vet save(Vet entity) {
        return vetRepository.save(entity);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
