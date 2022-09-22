package dbpetclinicdata.service;

import dbpetclinicdata.model.Owner;
import dbpetclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
