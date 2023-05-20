package com.acro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_management","app-user","appuser123");
            if(connection!=null) {
                {
                    System.out.println("connected to the database");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database" +e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Could you find the MySQL JDBC driver"+e.getMessage());

        }return connection;
    }
    public void closeConnection(Connection connection){
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Disconnected from the database");
            }
        }
            catch(SQLException e){
                System.out.println("Error closing the connection:" +e.getMessage());

            }
        }
    }

