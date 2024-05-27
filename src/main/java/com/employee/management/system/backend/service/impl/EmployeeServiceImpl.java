package com.employee.management.system.backend.service.impl;

import com.employee.management.system.backend.model.Employee;
import com.employee.management.system.backend.model.EmployeeResponse;
import com.employee.management.system.backend.repository.EmployeeRepository;
import com.employee.management.system.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeesByDepartment(String departmentName) {

        return employeeRepository.findByDepartmentName(departmentName);
    }

    @Override
    public List<Employee> getEmployeesBySalary(double salary, String comparison) {
        if ("less".equalsIgnoreCase(comparison)) {
            return employeeRepository.findBySalaryLessThan(salary);
        } else {
            return employeeRepository.findBySalaryGreaterThan(salary);
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
