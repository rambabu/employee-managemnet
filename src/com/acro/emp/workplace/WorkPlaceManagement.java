package com.acro.emp.workplace;

import java.time.LocalDate;

public class WorkPlaceManagement {
        //login,AssignCourse,completeCourse
    public Employee login(Employee[] employees,String userName){
        for(int i=0;i<employees.length;i++){
            if(userName.equals(employees[i].userName)){
                System.out.println("login successful"+employees[i].userName);
                return employees[i];
            }
        }
        System.out.println("login failed");
        return null;
    }
    public Training AssignCourse(Course course,Employee employee) {
        Training training = new Training(employee.empId, course.courseId, LocalDate.now(), LocalDate.now().plusDays(30));
        System.out.println(course.courseName + " is assigned to"+employee.empName);
        return training;

    }
    public Training completeCourse(Course[] courses,Employee employee){

    }

    public static void main(String[] args) {
        WorkPlaceManagement workPlaceManagement=new WorkPlaceManagement();
        Course course1=new Course(201, "workplace security",  60, 30);
        Course course2=new Course(202, "Workplace violence prevention",  65, 45);
        Course course3=new Course(203, "Employee health resources",  70, 60);
        Course[] courses= {course1, course2, course3};

        Employee emp1=new Employee(101,"Nagarani","RaniAnirudh",6000.00f,10);
        Employee emp2=new Employee(102,"Swathi","Swathi",7000.00f,8);
        Employee emp3=new Employee(102,"Pallavi","Pal",5000.00f,11);
        Employee[] employees={emp1,emp2,emp3};




        System.out.println("employee work place");


    }
}
