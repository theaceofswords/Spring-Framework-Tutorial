package com.springexample.petclinic.services.map;

import com.springexample.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID> {
    protected Map<Long, T> map = new HashMap<>();


    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(generateId());
            }
            map.put(object.getId(), object);
        } else throw new RuntimeException("Null Object");

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long generateId() {
        Long nextId = null;

        try {
            do {
                nextId = (long) (Math.random() * (1000 - 100 + 1) + 100);
            } while (map.containsKey(nextId));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        return nextId;
    }
}
