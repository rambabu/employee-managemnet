package com.acro.controller;

import com.acro.emp.workplace.Employee;
import com.acro.service.EmployeeService;
import com.acro.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Map;

public class

EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();

    // createEmployee
    public Employee createEmployee(Employee employee) throws Exception {
        //int empId, String firstName, String lastName, String userName,int age, designation, float salary
        if (employee.getFirstName().length() > 1 && employee.getLastName().length() > 1 && employee.getUserName().length() > 3 && employee.getUserName().length() < 10 &&
                employee.getAge() > 25 && employee.getDesignation() != null && employee.getSalary() > 5500) {
            throw new Exception("Employee is not valid");
        }
        Employee newlyCreatedEmployee = employeeService.saveEmployee(employee);
        System.out.println("saved successfully " + newlyCreatedEmployee.getEmpId());
        return newlyCreatedEmployee;
    }
    public Employee getEmployeeById(int empId){
        return employeeService.getEmployeeById(empId);

    }
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);

    }
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();

    }
    public  boolean deleteEmployee(Employee employee){
        if(employee.getEmpId()>0){
            System.out.println("deleted employee");
        }
        else {
            throw new RuntimeException("employee not valid");
        }
        boolean deletedEmployee=employeeService.deleteEmployee(employee);
        System.out.println("deleted successfully:" +employee.getUserName());
        return deletedEmployee;
    }
    public Map<String,Long> getEmployeeCountByDesignation(){
        return employeeService.getEmployeeCountByDesignation();
    }
}

