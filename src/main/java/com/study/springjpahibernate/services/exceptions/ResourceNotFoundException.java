package com.study.springjpahibernate.services.exceptions;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. ID " + id);
    }
}
