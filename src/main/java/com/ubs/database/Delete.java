package com.ubs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world";
        String driver = "com.mysql.jdbc.Driver";
        String login = "root";
        String password = "parth";
        Connection connection = null;
        Statement statement = null;
        String sql = "delete from employee where emp_id = 1;";

        try {

            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
            System.out.println(" Number of Records deleted: " + count);

        } catch (SQLException e) {
            e.printStackTrace();
            }catch (Exception e) {
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
