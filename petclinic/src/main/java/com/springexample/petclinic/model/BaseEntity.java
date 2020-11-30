package com.springexample.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;
//    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
