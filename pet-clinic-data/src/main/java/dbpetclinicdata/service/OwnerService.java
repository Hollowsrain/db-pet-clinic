package dbpetclinicdata.service;

import dbpetclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findBtLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
