package com.adiberrifai.spring5recipeapp.repositories;

import com.adiberrifai.spring5recipeapp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

     Optional<Category> findByDescription(String description);
}
