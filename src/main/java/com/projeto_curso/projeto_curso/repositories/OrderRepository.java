package com.projeto_curso.projeto_curso.repositories;

import com.projeto_curso.projeto_curso.Entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}