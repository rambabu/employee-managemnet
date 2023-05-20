package com.acro.repository;

import com.acro.db.DBConnection;
import com.acro.emp.workplace.Training;

import java.sql.*;

public class TrainingRepositoryImpl implements TrainingRepository{
    DBConnection dbConnection=new DBConnection();
    //int empId, int courseId, LocalDate assignedDate,  LocalDate dueDate

    public Training assignCourse(Training t) {
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlInsert = "insert into Training(empId,courseId,assignedDate,dueDate) values(?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(mysqlInsert);
            pst.setInt(1,t.getEmpId());
            pst.setInt(2,t.getCourseId());
            pst.setDate(3, Date.valueOf(t.getAssignedDate()));
            pst.setDate(4,Date.valueOf(t.getDueDate()));
            int resultSet = pst.executeUpdate();
//            pst.getGeneratedKeys();
            return (resultSet>0 ? t : null);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
