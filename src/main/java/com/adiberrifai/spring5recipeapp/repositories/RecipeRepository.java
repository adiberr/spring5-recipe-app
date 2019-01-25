package com.adiberrifai.spring5recipeapp.repositories;

import com.adiberrifai.spring5recipeapp.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
