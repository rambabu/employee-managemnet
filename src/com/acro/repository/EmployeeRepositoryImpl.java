package com.acro.repository;


import com.acro.db.DBConnection;
import com.acro.emp.workplace.Designation;
import com.acro.emp.workplace.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeRepositoryImpl implements EmployeeRepository {
    DBConnection dbConnection= new DBConnection();
    public int createEmployee(Employee employee){

        try {
            Connection connection=dbConnection.getConnection();
            //int empId, String firstName, String lastName, String userName,int age, Designation designation, float salary
            String mysqlInsert="INSERT INTO Employee(emp_Id,firstName,LastName,userName,designation,salary) values(?,?,?,?,?,?)";
            PreparedStatement pst= connection.prepareStatement(mysqlInsert,Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, employee.getEmpId());
            pst.setString(2, employee.getFirstName());
            pst.setString(3, employee.getLastName());
            pst.setString(4, employee.getUserName());
            pst.setString(5,employee.getDesignation().name());
            pst.setDouble(6,employee.getSalary());
            int result = pst.executeUpdate();
            System.out.println("employee created"+ result);
            ResultSet resultSet = pst.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
            return -1;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Employee getEmployeeId(int empId) {
        try{
            Connection connection=dbConnection.getConnection();
            String mysqlSelect=" select * from employee where emp_Id=?";
            PreparedStatement st = connection.prepareStatement(mysqlSelect);
            st.setInt(1, empId);
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("emp_Id");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String userName = resultSet.getString("userName");
                float salary=resultSet.getFloat("salary");
                String designation=resultSet.getString("designation");
                Designation des = Designation.valueOf(designation);

                return new Employee(id,firstName, lastName, userName, salary, des);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }

    public Employee updateEmployee(Employee employee) {
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlUpdate = "update Employee set userName=? where emp_Id=?";
            PreparedStatement st = connection.prepareStatement(mysqlUpdate);
            st.setString(1, employee.getUserName());
            st.setInt(2, employee.getEmpId());
            int resultSet = st.executeUpdate();
            return(resultSet>0 ? employee : null);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlSelect = "select * from employee";
            PreparedStatement st = connection.prepareStatement(mysqlSelect);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {             //int empId, String firstName, String lastName, String userName,int age, Designation designation, float salary
                int id = rs.getInt("emp_Id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String userName = rs.getString("userName");
                float salary = rs.getFloat("salary");
                String designation = rs.getString("designation");
                Designation des = Designation.valueOf(designation);

                Employee employee = new Employee(id, firstName, lastName, userName, salary, des);
                employees.add(employee);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;

    }

        public boolean deleteEmployee(Employee employee) {
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlDelete = "Delete from Employee where emp_Id=?";
            PreparedStatement st = connection.prepareStatement(mysqlDelete);
            st.setInt(1, employee.getEmpId());
            int resultSet = st.executeUpdate();
            System.out.println(+resultSet);
            return resultSet==1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Map<String,Long> getEmployeeCountByDesignation(){
        Map<String,Long> map=new HashMap<>();
        try {
            Connection connection = dbConnection.getConnection();
            String mysqlSelect = "SELECT designation, count(*) as numberOfDesignation FROM emp_management.employee group by designation";

            PreparedStatement st = connection.prepareStatement(mysqlSelect);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {             //int empId, String firstName, String lastName, String userName,int age, Designation designation, float salary
                Long count = rs.getLong("numberOfDesignation");
                String designation = rs.getString("designation");
                map.put(designation,count);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return map;

        }



    }


