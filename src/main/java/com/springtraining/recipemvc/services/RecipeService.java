package com.springtraining.recipemvc.services;

import com.springtraining.recipemvc.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;
public interface RecipeService {

    Set<Recipe> getRecipes();
}
