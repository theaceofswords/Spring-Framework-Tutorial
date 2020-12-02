package com.spring.recipe.recipe.model;

import javax.persistence.*;

@Entity
public class  Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //get id from database upon persistence
    private Long id;
    @OneToOne                       //cascade not added so that if we delete the notes ob
    private Recipe recipe;          //we do not delete the recipe object. and we can delete notes
    @Lob                            // by deleted by deleting recipe ob
    private String recipeNotes;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
