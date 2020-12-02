package com.spring.recipe.recipe.repositories;

import com.spring.recipe.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
