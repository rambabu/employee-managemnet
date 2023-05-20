package com.acro.service;

import com.acro.emp.workplace.Course;
import com.acro.emp.workplace.Employee;
import com.acro.emp.workplace.Training;

import java.util.List;
import java.util.Set;

public interface TrainingService {
    //i/p:list of employees and list of courses,return list of trainings
    Set<Training> assignCourse(List<Employee> employees, List<Course> courses);
    Training assignCourse(Employee employee,Course course);
}
