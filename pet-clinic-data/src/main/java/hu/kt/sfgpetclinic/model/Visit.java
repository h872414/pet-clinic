package hu.kt.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends  BaseEntity{

    private LocalDate data;
    private String description;
    private Pet pet;

    public LocalDate getData() {
        return data;
    }

    public void setData(final LocalDate data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(final Pet pet) {
        this.pet = pet;
    }
}
