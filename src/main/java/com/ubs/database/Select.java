package com.ubs.database;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Select {

    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.Driver";
        String login = "root";
        String url = "jdbc:mysql://localhost:3306/world";
        String password = "parth";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from employee where emp_id >= 1;";
        try {
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while ( resultSet.next()) {

                    System.out.println("-------------------------------------------");
                    System.out.println(" Emp ID: " + resultSet.getInt(1));
                    System.out.println(" Emp FName: " + resultSet.getString(2));
                    System.out.println(" Emp LName: " + resultSet.getString(3));
                    System.out.println(" Emp Salary: " + resultSet.getDouble(4));
                    System.out.println("-------------------------------------------");

            }

        }catch (SQLException e){
            System.out.println( "Sql Exception: " + e.getErrorCode());
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
