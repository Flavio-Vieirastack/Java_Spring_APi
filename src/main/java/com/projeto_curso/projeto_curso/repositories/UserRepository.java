package com.projeto_curso.projeto_curso.repositories;

import com.projeto_curso.projeto_curso.Entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}