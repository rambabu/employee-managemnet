package com.acro.emp.workplace;

import com.acro.controller.CourseController;
import com.acro.controller.EmployeeController;
import com.acro.controller.TrainingController;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkPlaceManagement {
    EmployeeController employeeController=new EmployeeController();
    CourseController courseController=new CourseController();
    TrainingController trainingController=new TrainingController();

    public static void main(String[] args) {

        Course course1=new Course("workplace security",  60, 30);
        Course course2=new Course( "Workplace violence prevention",  65, 45);
        Course course3=new Course("Employee health resources",  70, 60);
        Course[] courses= {course1, course2, course3};


        Employee emp1=new Employee("Nagarani","Arvapalli","RaniAnirudh", 100000,Designation.Lead_Developer);
        Employee emp5=new Employee(105,"Siri","karanam","siri",24,Designation.CEO,200000f);



        WorkPlaceManagement workPlaceManagement = new WorkPlaceManagement();
        try {
      //      workPlaceManagement.createCourse(courses);
          //  workPlaceManagement.createEmployee(emp1);
          //  testCourse(course2, workPlaceManagement);
            workPlaceManagement.testEmployee(emp5);

            workPlaceManagement.testCourse(course3);
            workPlaceManagement.getEmployeeCountByDesignation();
           // workPlaceManagement.assignCourse();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void assignCourse(){
        List<Employee> employees=employeeController.getAllEmployees();
        List<Course> courses=courseController.getAllCourses();
        Set<Training> trainings=trainingController.assignCourse(employees,courses);
    }

    private void getEmployeeCountByDesignation() {
        Map<String,Long> map= employeeController.getEmployeeCountByDesignation();
        System.out.println(map);
    }

    public void testEmployee(Employee emp5)throws Exception{
        Employee employee= employeeController.createEmployee(emp5);
        System.out.println(" creating Employee ");

        Employee employeeById = employeeController.getEmployeeById(employee.getEmpId());
        System.out.println("user name: "+employeeById.getUserName());

        employeeController.updateEmployee(employeeById);
        System.out.println("updating employee ");

        List<Employee> allEmployees=employeeController.getAllEmployees();
        for(Employee employee1:allEmployees){
            System.out.println(employee1.getUserName());
        }
        Employee employeeById1 = employeeController.getEmployeeById(employee.getEmpId());
        System.out.println("User name: " +employeeById1.getUserName());
        employeeController.deleteEmployee(employeeById1);
        System.out.println("deleting employees");
        allEmployees=employeeController.getAllEmployees();

        for (Employee employee1:allEmployees) {
            System.out.println(employee1.getUserName());
        }

    }

    private void testCourse(Course course2) {
        Course course = courseController.createCourse(course2);
        System.out.println("creating course");

        Course courseById = courseController.getCourseById(course.getCourseId());
        System.out.println("course name: " +courseById.getCourseName());

        courseController.updateCourse(courseById);
        System.out.println("updating course");

        List<Course> allCourses = courseController.getAllCourses();

        for (Course course1:allCourses)
             {
                 System.out.println(course1.getCourseName());

        }
        Course courseById1 = courseController.getCourseById(course.getCourseId());
        System.out.println("course name: " +courseById1.getCourseName());
        courseController.deleteCourse(courseById1);
        System.out.println("deleting course");

        allCourses=courseController.getAllCourses();

        for (Course c:allCourses) {
            System.out.println(c.getCourseName());
        }

    }

}
