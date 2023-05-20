package com.acro.service;

import com.acro.emp.workplace.Course;
import com.acro.emp.workplace.Employee;
import com.acro.emp.workplace.Training;
import com.acro.repository.TrainingRepository;
import com.acro.repository.TrainingRepositoryImpl;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainingServiceImpl implements TrainingService {
    TrainingRepository trainingRepository = new TrainingRepositoryImpl();

    @Override
    public Set<Training> assignCourse(List<Employee> employees, List<Course> courses) {
        Set<Training> trainings=new HashSet<>();
        for (Employee employee: employees){
            for (Course course: courses){
                Training training = assignCourse(employee, course);
                System.out.println(training);
                trainings.add(training);
            }
        }
        return trainings;
    }


    public Training assignCourse(Employee employee,Course course) {
        Training training = new Training(employee.getEmpId(), course.getCourseId(), LocalDate.now(), LocalDate.now().plusDays(30));
        System.out.println(course.getCourseName() + " is assigned to " + employee.getFirstName() + employee.getLastName());
        return trainingRepository.assignCourse(training);


    }
}



