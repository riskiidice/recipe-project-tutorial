package com.example.recipeproject.repository;

import com.example.recipeproject.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
