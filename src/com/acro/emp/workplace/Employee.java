package com.acro.emp.workplace;

public class Employee {
    //empName,empId,designation,salary
    int empId;
    String firstName;
    String lastName;
    String userName;
    float salary;
    int age;

    Designation designation;

    public Employee(int empId, String firstName, String lastName, String userName,int age, Designation designation, float salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.salary = salary;
        this.designation = designation;
        this.age=age;
    }

    public Employee(String firstName, String lastName, String userName, float salary, Designation designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.salary = salary;
        this.designation = designation;
    }

    public Employee(int empId, String firstName, String lastName, String userName, float salary, Designation designation) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getUserName() {
        return userName;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
}
