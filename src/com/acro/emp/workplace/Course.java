package com.acro.emp.workplace;


public class Course {
    //courseid, coursename, minScore,course duration
    int courseId;
    String courseName;
    int minScore;
    int durationInMinutes;
    public Course(String courseName, int minScore, int durationInMinutes) {
        this.courseName = courseName;
        this.minScore = minScore;
        this.durationInMinutes = durationInMinutes;
    }

    public Course(int courseId, String courseName, int minScore, int durationInMinutes) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.minScore = minScore;
        this.durationInMinutes = durationInMinutes;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    /*Workplace violence prevention
workplace security
workplace ethics
Preventing workplace descrimination
workplace stress
safety essentials
workplace welbeing
Employee health resources
Online safety and cybersecurity.
Emergency evacuation procedures*/

}
