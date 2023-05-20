package com.acro.repository;

import com.acro.emp.workplace.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {
    int createEmployee(Employee employee);
    Employee getEmployeeId(int empId);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    boolean deleteEmployee(Employee employee);
     Map<String,Long> getEmployeeCountByDesignation();




}
