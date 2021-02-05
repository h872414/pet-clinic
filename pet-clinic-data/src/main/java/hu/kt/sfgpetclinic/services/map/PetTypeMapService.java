package hu.kt.sfgpetclinic.services.map;

import hu.kt.sfgpetclinic.model.PetType;
import hu.kt.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(final PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(final Long id) {
        return super.findById(id);
    }
}
