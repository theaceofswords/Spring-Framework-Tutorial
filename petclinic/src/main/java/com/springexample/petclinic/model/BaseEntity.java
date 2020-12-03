package com.springexample.petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@MappedSuperclass                                     //Tells this as aJPA base class for inheritance
public class BaseEntity implements Serializable {     // and do not need this to be mapped to data base
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public  void setId(Long id) {
        this.id = id;
    }


}
