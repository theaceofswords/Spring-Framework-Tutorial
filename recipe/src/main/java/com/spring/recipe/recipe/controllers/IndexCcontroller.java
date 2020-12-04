package com.spring.recipe.recipe.controllers;

import com.spring.recipe.recipe.model.Categories;
import com.spring.recipe.recipe.repositories.CategoriesRepository;
import com.spring.recipe.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexCcontroller {

    private CategoriesRepository categoriesRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexCcontroller(CategoriesRepository categoriesRepository,
                            UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoriesRepository = categoriesRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }



    @RequestMapping({"","/","/index"})
    public String getIndex(){
        Optional<Categories> category = categoriesRepository.findByDescription("American");
        System.out.printf("ID: "+category.get().getId());
        return "index";
    }
}
