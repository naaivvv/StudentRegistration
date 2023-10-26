/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentregistration.controllers;

import com.studentregistration.interfaces.UserInterface;
import com.studentregistration.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author cpe
 */
public class UserController implements UserInterface{
    @Override
    public boolean Login(User user) {
        try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM tbl_user WHERE username = ? AND password = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, user.getUname());
        statement.setString(2, user.getPwd());
        ResultSet rs = statement.executeQuery();if (rs.next()) {
        user.setFullname(rs.getString("fullname"));
        user.setIdno(rs.getString("idnumber"));
        return true;
        }
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,
        "Unable to get list of Students. Please see logs.",
        "Save Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Logs: " + e.getMessage());
        }
        return false;
    }
    
    @Override
    public void saveUser(User user) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "INSERT into tbl_user(idnumber, username, password, fullname)" 
                + "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, user.getIdno());
        statement.setString(2, user.getUname());
        statement.setString(3, user.getPwd());
        statement.setString(4, user.getFullname());
        statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "New user record was successfully saved.",
                    "Save",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to save user records. Please see logs.",
                    "Save Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
        }
    }
    
    @Override
    public void updateUser(User user) {
    try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "UPDATE tbl_user SET username = ?, "
        + "password = ?, fullname = ? WHERE idnumber = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, user.getUname());
        statement.setString(2, user.getPwd());
        statement.setString(3, user.getFullname());
        statement.setString(4, user.getIdno());
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null,
        "User record was successfully updated.",
        "Update", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,
        "Unable to update user record. Please see logs.",
        "Update Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Logs: " + e.getMessage());
    }
}
    
    @Override
    public List<User> searchUser(String searchKey, String searchString) {
        List<User> list = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM tbl_user WHERE username LIKE ? ORDER BY username";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + searchString + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setIdno(rs.getString("idnumber"));
            user.setUname(rs.getString("username"));
            user.setPwd(rs.getString("password"));
            user.setFullname(rs.getString("fullname"));
            list.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to get list of Users. Please see logs.",
            "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
            }
            return list;
        }
    
    @Override
    public List<User> userList() {
        List<User> list = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM tbl_user ORDER BY username";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setIdno(rs.getString("idnumber"));
            user.setUname(rs.getString("username"));
            user.setPwd(rs.getString("password"));
            user.setFullname(rs.getString("fullname"));
            list.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to get list of Users. Please see logs.",
            "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
            }
            return list;
        }
    @Override
    public User getUser(String idno) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM tbl_user WHERE idnumber = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, idno);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setIdno(rs.getString("idnumber"));
            user.setUname(rs.getString("username"));
            user.setPwd(rs.getString("password"));
            user.setFullname(rs.getString("fullname"));
            return user;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to get list of Students. Please see logs.",
            "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
            }
            return null;
        }

    @Override
    public void deleteUser(String idno) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "DELETE FROM tbl_user WHERE idnumber = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, idno);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null,
            "User record was successfully deleted.",
            "Delete", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to delete user record. Please see logs.",
            "Delete Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
        }
    }

    
}
