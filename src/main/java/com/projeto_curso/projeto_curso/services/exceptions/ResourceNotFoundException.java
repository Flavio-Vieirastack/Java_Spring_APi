package com.projeto_curso.projeto_curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException (Object id) {
        super("Resource not found Id:" + id);
    }
}