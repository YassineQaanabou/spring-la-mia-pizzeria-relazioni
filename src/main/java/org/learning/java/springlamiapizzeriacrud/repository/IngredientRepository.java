package org.learning.java.springlamiapizzeriacrud.repository;

import org.learning.java.springlamiapizzeriacrud.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}

