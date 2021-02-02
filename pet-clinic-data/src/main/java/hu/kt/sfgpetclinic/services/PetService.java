package hu.kt.sfgpetclinic.services;

import hu.kt.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {

}
