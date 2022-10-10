package dbpetclinicweb.service.jpa;

import dbpetclinicweb.model.Pet;
import dbpetclinicweb.repositories.PetRepository;
import dbpetclinicweb.service.PetService;

import java.util.HashSet;
import java.util.Set;


public class PetJPAService implements PetService {

    private final PetRepository petRepository;

    public PetJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElseThrow(() -> new RuntimeException("No pet found by Id: " + aLong));
    }

    @Override
    public Pet save(Pet entity) {
        return petRepository.save(entity);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
