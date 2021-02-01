package hu.kt.sfgpetclinic.services;

import hu.kt.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
