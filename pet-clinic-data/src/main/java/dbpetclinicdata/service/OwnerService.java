package dbpetclinicdata.service;

import dbpetclinicdata.model.Owner;

public interface OwnerService extends BaseService<Owner, Long> {

    Owner findByLastName(String lastName);

}
