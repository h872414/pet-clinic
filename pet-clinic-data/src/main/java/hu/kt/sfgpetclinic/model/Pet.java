package hu.kt.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
public class Pet  extends BaseEntity{

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(final PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
