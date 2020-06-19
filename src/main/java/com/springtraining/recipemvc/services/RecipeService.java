package com.springtraining.recipemvc.services;

import com.springtraining.recipemvc.domain.Recipe;

import java.util.Set;
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
