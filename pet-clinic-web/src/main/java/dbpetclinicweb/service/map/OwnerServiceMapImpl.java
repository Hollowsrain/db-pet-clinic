package dbpetclinicweb.service.map;

import dbpetclinicweb.model.Owner;
import dbpetclinicweb.model.Pet;
import dbpetclinicweb.service.OwnerService;
import dbpetclinicweb.service.PetService;
import dbpetclinicweb.service.PetTypeService;

import java.util.Set;

public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMapImpl(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner entity) {
        System.out.println("ASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        if (entity != null) {
            if (entity.getPets() != null) {
                entity.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else
                        throw new RuntimeException("Pet Type is required");

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(entity);
        } else
            return null;
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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
