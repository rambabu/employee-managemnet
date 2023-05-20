package com.acro.controller;

import com.acro.emp.workplace.Course;
import com.acro.service.CourseService;
import com.acro.service.CourseServiceImpl;

import java.util.List;

public class CourseController {
    CourseService courseService = new CourseServiceImpl();

    // Course Controller
    //    // createCourse
    //    // assignCourse
    //    // getAllCourses
    //    // getCourse (byId, byName)
    public Course createCourse(Course course) {//int courseId, String courseName, int minScore, int durationInMinutes
        if (course.getCourseName() != null) {
            System.out.println("Course created");
        } else {
            throw new RuntimeException("course not valid");
        }
        Course newlyCreatedCourse = courseService.saveCourse(course);
        System.out.println("saved successfully " + newlyCreatedCourse.getCourseId());
        return newlyCreatedCourse;
    }
    public List<Course> getAllCourses() {

        return courseService.getAllCourse();
    }

    public Course getCourseById(int courseId) {

        return courseService.getCourseById(courseId);

    }
    public Course updateCourse(Course course){
         return courseService.updateCourse(course);

    }

    public  boolean deleteCourse(Course course){
        if(course.getCourseId()>0){
            System.out.println("deleted course");
        }
        else {
            throw new RuntimeException("course not valid");
        }
        boolean deletedCourse=courseService.deleteCourse(course);
        System.out.println("deleted successfully:" +course.getCourseName());
        return deletedCourse;
    }

}


