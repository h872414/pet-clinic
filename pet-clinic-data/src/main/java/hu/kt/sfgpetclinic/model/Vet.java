package hu.kt.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }
}
