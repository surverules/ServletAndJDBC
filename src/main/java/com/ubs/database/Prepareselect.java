package com.ubs.database;

import java.sql.*;

public class Prepareselect {

    public static void main(String[] args) {

        String driver = "com.mysql.jdbc.Driver";
        String login = "root";
        String url = "jdbc:mysql://localhost:3306/world";
        String password = "parth";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from employee where emp_id > ?";



        try {

            connection = DriverManager.getConnection(url, login, password);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
/*            while (resultSet.next()){
                System.out.println("-------------------------------------------");
                System.out.println(" Emp ID: " + resultSet.getInt(1));
                System.out.println(" Emp FName: " + resultSet.getString(2));
                System.out.println(" Emp LName: " + resultSet.getString(3));
                System.out.println(" Emp Salary: " + resultSet.getDouble(4));
                System.out.println("-------------------------------------------");

            }*/

            while (resultSet.next()){

                for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++){

                    System.out.print(" : " + resultSetMetaData.getColumnName(i));
                    System.out.print(" -  " + resultSet.getString(i));
                    System.out.println();
                }

                System.out.println("-------------------------------------------");
            }



        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();

            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
