package com.employee.management.system.backend.model;

import lombok.Data;

@Data
public class EmployeeResponse {

    private Long id;
    private String name;
    private double salary;
    private String departmentName;

    public EmployeeResponse(Long id, String name, double salary, String departmentName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }
}
