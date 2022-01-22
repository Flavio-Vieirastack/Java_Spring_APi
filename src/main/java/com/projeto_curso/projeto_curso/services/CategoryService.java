package com.projeto_curso.projeto_curso.services;

import java.util.List;
import java.util.Optional;

import com.projeto_curso.projeto_curso.Entities.Category;
import com.projeto_curso.projeto_curso.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll (){
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}