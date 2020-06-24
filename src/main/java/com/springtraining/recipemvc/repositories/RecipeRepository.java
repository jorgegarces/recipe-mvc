package com.springtraining.recipemvc.repositories;

import com.springtraining.recipemvc.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
