package com.acro.service;

import com.acro.emp.workplace.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee getEmployeeById(int empId);
    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Employee employee);
    Map<String,Long> getEmployeeCountByDesignation();
}
