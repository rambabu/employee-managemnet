package com.acro.repository;

import com.acro.db.DBConnection;
import com.acro.emp.workplace.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {
    DBConnection dbConnection = new DBConnection();

    public int createCourse(Course course) {
        Connection connection = dbConnection.getConnection();
        try {
            String mysqlInsert = "Insert into Course(courseId,courseName, minScore, durationInMinutes) values(?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(mysqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, course.getCourseId());
            pst.setString(2, course.getCourseName());
            pst.setDouble(3, course.getMinScore());
            pst.setInt(4, course.getDurationInMinutes());
            int result = pst.executeUpdate();
            System.out.println("Course created"+ result);
            ResultSet resultSet = pst.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
            return -1;

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }

    public List<Course> getAllCourses() {
        List<Course> courses=new ArrayList<>();
       try {
           Connection connection = dbConnection.getConnection();
           String mysqlSelect = "select * from course";
           PreparedStatement st = connection.prepareStatement(mysqlSelect);
           ResultSet rs = st.executeQuery();
           while (rs.next()) {
                int id=rs.getInt("courseId");
                String courseName=rs.getString("courseName");
                int minScore=rs.getInt("minScore");
                int duration=rs.getInt("durationInMinutes");
                Course course= new Course(id,courseName,minScore,duration);
                courses.add(course);
           }

       } catch (SQLException e) {
           throw new RuntimeException(e);

       }

        return courses;
    }

    public Course getCourseById(int courseId) {
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlSelect = "select * from course where courseId=?";//+courseId;
            PreparedStatement st = connection.prepareStatement(mysqlSelect);
            st.setInt(1, courseId);
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("courseId");
                String courseName = resultSet.getString("courseName");
                int minScore = resultSet.getInt("minScore");
                int duration = resultSet.getInt("durationInMinutes");
                return new Course(id, courseName, minScore, duration);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }

    public Course updateCourse(Course course) {
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlUpdate = "update Course set courseName=? where courseId=?";
            PreparedStatement st = connection.prepareStatement(mysqlUpdate);
            st.setString(1, course.getCourseName());
            st.setInt(2, course.getCourseId());
            int resultSet = st.executeUpdate();
            return(resultSet>0 ? course : null);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteCourse(Course course) {
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlDelete = "Delete from Course where courseId=?";
            PreparedStatement st = connection.prepareStatement(mysqlDelete);
            st.setInt(1, course.getCourseId());
            int resultSet = st.executeUpdate();
            System.out.println(+resultSet);
            return resultSet==1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}