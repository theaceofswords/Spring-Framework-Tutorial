package com.spring.recipe.recipe.bootstrap;

import com.spring.recipe.recipe.model.Recipe;
import com.spring.recipe.recipe.repositories.CategoriesRepository;
import com.spring.recipe.recipe.repositories.RecipeRepository;
import com.spring.recipe.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.ArrayList;
import java.util.List;

public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final RecipeRepository recipeRepository;
    private final CategoriesRepository categoriesRepository;
    private final UnitOfMeasureRepository uom;

    public Bootstrap(RecipeRepository recipeRepository,
                     CategoriesRepository categoriesRepository,
                     UnitOfMeasureRepository uom) {
        this.recipeRepository = recipeRepository;
        this.categoriesRepository = categoriesRepository;
        this.uom = uom;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        recipeRepository.saveAll(getRecipes());
    }

    private List<Recipe> getRecipes(){
        List<Recipe> recipes = new ArrayList<>();



        return recipes;
    }
}
