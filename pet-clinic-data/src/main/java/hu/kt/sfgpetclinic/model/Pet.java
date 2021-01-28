package hu.kt.sfgpetclinic.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pet  {
    PetType petType;
    Owner owner;
    LocalDate birthDate;
}
