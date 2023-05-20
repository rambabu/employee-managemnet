package com.acro.service;

import com.acro.emp.workplace.Employee;
import com.acro.repository.EmployeeRepository;
import com.acro.repository.EmployeeRepositoryImpl;

import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    public Employee saveEmployee(Employee employee){
        int empId=employeeRepository.createEmployee(employee);
        employee.setEmpId(empId);
        return employee;
    }

    public Employee getEmployeeById(int empId) {

        return employeeRepository.getEmployeeId(empId);
    }
    public Employee updateEmployee(Employee employee){
        String userName=employee.getUserName();
        userName=(userName.toLowerCase());
        employee.setUserName(userName);
        return employeeRepository.updateEmployee(employee);

    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();

    }
    public boolean deleteEmployee(Employee employee){
        return employeeRepository.deleteEmployee(employee);

    }
    public Map<String,Long> getEmployeeCountByDesignation(){
        return employeeRepository.getEmployeeCountByDesignation();
    }
}
