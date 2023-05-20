package com.acro.service;

import com.acro.emp.workplace.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();

    Course getCourseById(int courseId);

    Course updateCourse(Course course);
    boolean deleteCourse(Course course);

    Course saveCourse(Course course);
}
