package com.spring.recipe.recipe.repositories;

import com.spring.recipe.recipe.model.Categories;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoriesRepository extends CrudRepository<Categories,Long> {
    Optional<Categories> findByDescription(String description);  //optionally return Categories

}
