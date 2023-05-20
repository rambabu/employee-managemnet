package com.acro.repository;

import com.acro.emp.workplace.Course;

import java.util.List;

public interface CourseRepository {
    int createCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(int courseId);
    Course updateCourse(Course course);
    boolean deleteCourse(Course course);

}
