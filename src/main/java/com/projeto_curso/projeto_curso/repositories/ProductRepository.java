package com.projeto_curso.projeto_curso.repositories;

import com.projeto_curso.projeto_curso.Entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}