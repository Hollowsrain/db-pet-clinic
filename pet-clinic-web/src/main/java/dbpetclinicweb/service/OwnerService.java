package dbpetclinicweb.service;

import dbpetclinicweb.model.Owner;

public interface OwnerService extends BaseService<Owner, Long> {

    Owner findByLastName(String lastName);

}
