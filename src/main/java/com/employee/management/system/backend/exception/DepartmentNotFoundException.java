package com.employee.management.system.backend.exception;

public class DepartmentNotFoundException  extends RuntimeException{
    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
