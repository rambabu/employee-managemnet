package com.acro.service;

import com.acro.emp.workplace.Course;
import com.acro.repository.CourseRepository;
import com.acro.repository.CourseRepositoryImpl;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    CourseRepository courseRepository = new CourseRepositoryImpl();
    public Course saveCourse(Course course) {
        int courseId = courseRepository.createCourse(course);
        course.setCourseId(courseId);
        return course;
    }
    public List<Course> getAllCourse()
    {
        return courseRepository.getAllCourses();
    }

    public Course getCourseById(int courseId)
    {
        return courseRepository.getCourseById(courseId);
    }
    public Course updateCourse(Course course){
        String courseName=course.getCourseName();
        courseName=(courseName.toUpperCase());
        course.setCourseName(courseName);
        return courseRepository.updateCourse(course);

    }
    public boolean deleteCourse(Course course){
        return courseRepository.deleteCourse(course);

    }

}
