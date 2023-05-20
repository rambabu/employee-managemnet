package com.acro.controller;

import com.acro.emp.workplace.Course;
import com.acro.emp.workplace.Employee;
import com.acro.emp.workplace.Training;
import com.acro.service.TrainingService;
import com.acro.service.TrainingServiceImpl;

import java.util.List;
import java.util.Set;

public class TrainingController {
//int empId, int courseId, LocalDate assignedDate,  LocalDate dueDate
    TrainingService trainingService=new TrainingServiceImpl();
    public Set<Training> assignCourse(List<Employee> employees, List<Course> courses){
        return trainingService.assignCourse(employees,courses);

    }
    public Training assignCourse(Employee employee,Course course){
        return trainingService.assignCourse(employee,course);

    }

}
