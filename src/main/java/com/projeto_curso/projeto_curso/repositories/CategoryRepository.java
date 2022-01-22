package com.projeto_curso.projeto_curso.repositories;

import com.projeto_curso.projeto_curso.Entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}