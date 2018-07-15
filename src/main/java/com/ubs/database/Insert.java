package com.ubs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.Driver";
        String login = "root";
        String url = "jdbc:mysql://localhost:3306/world";
        String password = "parth";
        String sql1 = "insert into employee values (2, \"pravin\",\"surve\", 100.1);";
        String sql2 = "insert into employee values (3, \"ganesh\",\"surve\", 100.1);";
        String sql3 = "insert into employee values (4, \"avinash\",\"surve\", 100.1);";
        String sql4 = "insert into employee values (5, \"Deepak\",\"surve\", 100.1);";

        Connection connection = null;
        Statement statement = null;

        try {

            Class.forName(driver);
            connection = DriverManager.getConnection(url, login, password);

            statement = connection.createStatement();
            //int count = statement.executeUpdate(sql);
            statement.addBatch(sql1);
            statement.addBatch(sql2);
            statement.addBatch(sql3);
            statement.addBatch(sql4);
            int[] rc = statement.executeBatch();


        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
           try {
               statement.close();
               connection.close();
           } catch (SQLException e){
               e.printStackTrace();
           }

        }


    }


}
