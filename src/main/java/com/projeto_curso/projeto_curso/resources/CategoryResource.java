package com.projeto_curso.projeto_curso.resources;

import java.util.List;

import com.projeto_curso.projeto_curso.Entities.Category;
import com.projeto_curso.projeto_curso.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService userService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll () {
        List<Category> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById (@PathVariable Long id) {
        Category obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}