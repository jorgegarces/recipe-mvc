package com.springtraining.recipemvc.services;

import com.springtraining.recipemvc.commands.RecipeCommand;
import com.springtraining.recipemvc.domain.Recipe;

import java.util.Set;
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    void deleteById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);
}
