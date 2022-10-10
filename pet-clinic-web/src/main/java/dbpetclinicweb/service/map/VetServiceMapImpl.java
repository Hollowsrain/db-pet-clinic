package dbpetclinicweb.service.map;

import dbpetclinicweb.model.Vet;
import dbpetclinicweb.service.SpecialtyService;
import dbpetclinicweb.service.VetService;

import java.util.Set;


public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMapImpl(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet entity) {

        if (entity.getSpecialities().size() > 0) {
            entity.getSpecialities().forEach(speciality -> {
                if (speciality != null) {
                    if (speciality.getId() == null) {
                        speciality.setId(specialtyService.save(speciality).getId());
                    }
                } else
                    throw new RuntimeException("Speciality can't be null");
            });
        }
        return super.save(entity);
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
