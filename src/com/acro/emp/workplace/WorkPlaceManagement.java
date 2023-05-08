package com.acro.emp.workplace;

import java.time.LocalDate;
import java.util.Objects;

public class WorkPlaceManagement {

    private Course[] courses;
    private Employee[] employees;

    public WorkPlaceManagement(Course[] courses, Employee[] employees) {
        this.courses = courses;
        this.employees = employees;
    }

        //login,AssignCourse,completeCourse
    public Employee login(String userName){
        for(int i=0;i<employees.length;i++){
            if(userName.equals(employees[i].userName)){
                System.out.println("login successful " +employees[i].userName);
                return employees[i];
            }
        }
        System.out.println("login failed");
        return null;
    }
    public Training assignCourse(Course course,Employee employee) {
        Training training = new Training(employee.empId, course.courseId, LocalDate.now(), LocalDate.now().plusDays(30));
        System.out.println(course.courseName + " is assigned to "+employee.empName);
        return training;

    }
    public Course findCourseById(int courseId){
        for (Course course : courses) {
            if (course.courseId == courseId) {
                return course;
            }
        }
        return null;
    }

    public void completeCourse(Employee employee, Training[] trainings){

        for (Training training : trainings) {               //class name object : array of class
            if (training.completionDate == null) {
                Course course = findCourseById(training.courseId);
                if(course !=null) {
                    training.score = Math.random() * 100;

                    if(training.score>=course.minScore){
                        training.completionDate = LocalDate.now();
                        System.out.println(employee.userName + ", completed course: " + course.courseName + ". The score is: " +training.score);
                    } else {
                        System.out.println("please retake the test, your score: " + training.score);
                    }
                }


            }

        }

    }

    public static void main(String[] args) {

        Course course1=new Course(201, "workplace security",  60, 30);
        Course course2=new Course(202, "Workplace violence prevention",  65, 45);
        Course course3=new Course(203, "Employee health resources",  70, 60);
        Course[] courses= {course1, course2, course3};

        Employee emp1=new Employee(101,"Nagarani","RaniAnirudh",6000.00f,10);
        Employee emp2=new Employee(102,"Swathi","Swathi",7000.00f,8);
        Employee emp3=new Employee(102,"Pallavi","Pal",5000.00f,11);
        Employee[] employees={emp1,emp2,emp3};

        WorkPlaceManagement workPlaceManagement=new WorkPlaceManagement(courses,employees);
        workPlaceManagement.login(emp1.userName);

        Training training1 = workPlaceManagement.assignCourse(course1, emp1);
        Training training2 = workPlaceManagement.assignCourse(course2, emp1);
        Training[] emp1Trainings = {training1, training2};

        workPlaceManagement.completeCourse(emp1, emp1Trainings);



        System.out.println("employee work place");


    }
}
