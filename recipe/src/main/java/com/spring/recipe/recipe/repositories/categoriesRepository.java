package com.spring.recipe.recipe.repositories;

import com.spring.recipe.recipe.model.Categories;
import org.springframework.data.repository.CrudRepository;

public interface categoriesRepository extends CrudRepository<Categories,Long> {
}
