package com.projeto_curso.projeto_curso.services;

import java.util.List;
import java.util.Optional;

import com.projeto_curso.projeto_curso.Entities.Order;
import com.projeto_curso.projeto_curso.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll (){
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}