package com.projeto_curso.projeto_curso.resources;

import java.util.List;

import com.projeto_curso.projeto_curso.Entities.Product;
import com.projeto_curso.projeto_curso.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
    @Autowired
    private ProductService ProductService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll () {
        List<Product> list = ProductService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById (@PathVariable Long id) {
        Product obj = ProductService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}