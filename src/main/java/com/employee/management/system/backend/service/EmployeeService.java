package com.employee.management.system.backend.service;

import com.employee.management.system.backend.model.Employee;

import java.util.List;

public interface EmployeeService {


    List<Employee> getEmployeesByDepartment(String departmentName);
    List<Employee> getEmployeesBySalary(double salary, String comparison);
    List<Employee> getAllEmployees();
}
