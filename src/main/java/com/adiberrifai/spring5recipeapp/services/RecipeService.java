package com.adiberrifai.spring5recipeapp.services;

import com.adiberrifai.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
