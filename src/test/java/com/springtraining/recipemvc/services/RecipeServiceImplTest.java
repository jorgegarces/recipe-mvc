package com.springtraining.recipemvc.services;

import com.springtraining.recipemvc.domain.Recipe;
import com.springtraining.recipemvc.repositories.RecipeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RecipeServiceImplTest {

    @Mock
    RecipeRepository recipeRepository;

    @InjectMocks
    RecipeServiceImpl recipeService;

    @Test
    public void getRecipeByIdTest() {

        Recipe recipe = new Recipe();
        recipe.setId(1L);

        when(recipeRepository.findById(any())).thenReturn(java.util.Optional.of(recipe));

        Assertions.assertEquals(1, recipeService.findById(1L).getId());
        verify(recipeRepository, times(1)).findById(any());
        verify(recipeRepository, never()).findAll();
    }

    @Test
    void getRecipesTest() {

        Recipe recipe = new Recipe();
        HashSet<Recipe> recipesData = new HashSet<Recipe>();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        Assertions.assertEquals(1, recipes.size());
        verify(recipeRepository, times(1 )).findAll();
    }


    @Test
    void deleteByIdTest() {

        Long idToDelete = 2L;
        recipeService.deleteById(idToDelete);

        verify(recipeRepository, times(1)).deleteById(anyLong());
    }
}