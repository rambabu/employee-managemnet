package com.acro.emp.workplace;

public class Employee {
    //empName,empId,designation,salary
    int empId;
    String empName;
    String userName;
    float salary;
    int noOfCoursesCompleted;
    public Employee(int empId,String empName,String userName,float salary,int noOfCoursesCompleted){
        this.userName=userName;
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
        this.noOfCoursesCompleted=noOfCoursesCompleted;

    }

}
