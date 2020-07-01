package com.springtraining.recipemvc.services;

import com.springtraining.recipemvc.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long aLong, Long l);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
