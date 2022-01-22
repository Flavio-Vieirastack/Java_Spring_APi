package com.projeto_curso.projeto_curso.repositories;

import com.projeto_curso.projeto_curso.Entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}