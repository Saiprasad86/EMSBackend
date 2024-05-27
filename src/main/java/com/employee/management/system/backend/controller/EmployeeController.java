package com.employee.management.system.backend.controller;

import com.employee.management.system.backend.mapper.EmployeeResponseMapper;
import com.employee.management.system.backend.model.Employee;
import com.employee.management.system.backend.exception.DepartmentNotFoundException;
import com.employee.management.system.backend.model.EmployeeResponse;
import com.employee.management.system.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/by-department")
    public List<EmployeeResponse> getEmployeesByDepartment(@RequestParam String departmentName) {
        List<Employee> employees = employeeService.getEmployeesByDepartment(departmentName);
        if(employees.isEmpty()) {
            throw new DepartmentNotFoundException("Department not found with name: " + departmentName);
        }
        return employees.stream().map(EmployeeResponseMapper::mapToDTO).collect(Collectors.toList());
    }

    @GetMapping("/by-salary")
    public List<EmployeeResponse> getEmployeesBySalary(@RequestParam double salary, @RequestParam String comparison) {
        List<Employee> employeesBySalary = employeeService.getEmployeesBySalary(salary, comparison);
        return employeesBySalary.stream().map(EmployeeResponseMapper::mapToDTO).collect(Collectors.toList());

    }

    @GetMapping
    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees.stream().map(EmployeeResponseMapper::mapToDTO).collect(Collectors.toList());
    }

}
