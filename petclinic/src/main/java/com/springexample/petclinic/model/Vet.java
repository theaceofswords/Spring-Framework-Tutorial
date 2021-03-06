package com.springexample.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialitiles",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<VetSpeciality> specialities = new HashSet<>();

    public Set<VetSpeciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<VetSpeciality> specialities) {
        this.specialities = specialities;
    }
}
