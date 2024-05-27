package com.employee.management.system.backend.mapper;

import com.employee.management.system.backend.model.Employee;
import com.employee.management.system.backend.model.EmployeeResponse;

public class EmployeeResponseMapper {

    public static EmployeeResponse mapToDTO(Employee employee) {
        String departmentName = employee.getDepartment() != null ? employee.getDepartment().getName() : "N/A";
        return new EmployeeResponse(employee.getId(), employee.getName(), employee.getSalary(), departmentName);
    }
}
