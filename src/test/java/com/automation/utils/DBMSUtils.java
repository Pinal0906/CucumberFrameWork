package com.automation.utils;

import java.sql.*;

public class DBMSUtils {
    public static void main(String[] args) throws Exception {

        // 1 Register a driver and create connection

        Class.forName("com.mysql.cj.jdbc.Driver"); // we are registering this driver, this is just additional line we do
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","Admin@123");

        // 2. Query Database

       Statement stmt = con.createStatement(); // created object for statement/query
       ResultSet rs = stmt.executeQuery("select first_name, cost from \n" +
               "employees INNER JOIN employee_membership ON \n" +
               "Employees.emp_id = employee_membership.emp_id INNER JOIN membership ON\n" +
               "employee_membership.membership_id = membership.membership_id;\n "); // provider query statement
        //3. Process the result
/*
        rs.next(); // this line means it will give result of next line, so basically rather tha retriving column name it will retrive first value of column
        System.out.println(rs.getString("first_name")); // here we are mentioning column name for which we want result from above statement

        rs.next();
        System.out.println(rs.getString("first_name"));
        */
        while (rs.next()){ // to reduce to write above lines everytime, we use loop
            System.out.print(rs.getString("first_name") + "  ");
            System.out.println(rs.getString("cost"));

        }
        //4. close the connection
       // con.close(); // this line is not necessary to write till u r working to work fast, as it everytime open and close connection
    }
}
