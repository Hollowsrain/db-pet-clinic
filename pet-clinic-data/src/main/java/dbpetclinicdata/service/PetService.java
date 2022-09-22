package dbpetclinicdata.service;

import dbpetclinicdata.model.Owner;
import dbpetclinicdata.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
