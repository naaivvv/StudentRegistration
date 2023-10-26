/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentregistration.controllers;

import java.sql.*;

/**
 *
 * @author cpe
 */
public class DatabaseConnection {
    private static Connection conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/student_reg", "root", "");
            return conn;
        } catch (SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
        return null;
    }
}
