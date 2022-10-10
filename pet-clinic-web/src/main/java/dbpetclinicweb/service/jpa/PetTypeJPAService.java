package dbpetclinicweb.service.jpa;

import dbpetclinicweb.model.PetType;
import dbpetclinicweb.repositories.PetTypeRepository;
import dbpetclinicweb.service.PetTypeService;

import java.util.HashSet;
import java.util.Set;


public class PetTypeJPAService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElseThrow(() -> new RuntimeException("No petType found by Id: " + aLong));
    }

    @Override
    public PetType save(PetType entity) {
        return petTypeRepository.save(entity);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
