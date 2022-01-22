package com.projeto_curso.projeto_curso.services.exceptions;

public class DataBaseException extends RuntimeException {
    public DataBaseException (String message) {
        super(message);
    }
}