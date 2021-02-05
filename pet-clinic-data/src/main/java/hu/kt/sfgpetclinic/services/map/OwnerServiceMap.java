package hu.kt.sfgpetclinic.services.map;

import hu.kt.sfgpetclinic.model.Owner;
import hu.kt.sfgpetclinic.model.Pet;
import hu.kt.sfgpetclinic.services.OwnerService;
import hu.kt.sfgpetclinic.services.PetService;
import hu.kt.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(final PetTypeService petTypeService, final PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(final Owner object) {

        if (object != null) {
            if(object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() != null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }else {
                            throw new RuntimeException("Pet Type is required");
                        }
                        if(pet.getId() == null){
                            Pet savedPet = petService.save(pet);
                            pet.setId(savedPet.getId());
                        }
                    }
                });
            }
            return super.save(object);
        }

        return null;
    }

    @Override
    public Owner findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(final String lastName) {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
