/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentregistration.controllers;
import com.studentregistration.interfaces.StudentInterface;
import com.studentregistration.models.Student;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author cpe
 */
public class StudentController implements StudentInterface{

    @Override
    public void saveStudent(Student student) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "INSERT into tbl_student(idnumber, lastname, firstname, middle, age, gender, dob, address)" 
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, student.getIdno());
        statement.setString(2, student.getLastname());
        statement.setString(3, student.getFirstname());
        statement.setString(4, student.getMiddle());
        statement.setInt(5, student.getAge());
        statement.setString(6, student.getGender());
        statement.setString(7, student.getDob());
        statement.setString(8, student.getAddress());
        
        statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "New student record was successfully saved.",
                    "Save",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to save student records. Please see logs.",
                    "Save Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
        }
    }

    @Override
    public void updateStudent(Student student) {
    try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "UPDATE tbl_student SET lastname = ?, "
        + "firstname = ?, middle = ?, age = ?, gender = ?, "
        + "dob = ?, address = ? WHERE idnumber = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, student.getLastname());
        statement.setString(2, student.getFirstname());
        statement.setString(3, student.getMiddle());
        statement.setInt(4, student.getAge());
        statement.setString(5, student.getGender());
        statement.setString(6, student.getDob());
        statement.setString(7, student.getAddress());
        statement.setString(8, student.getIdno());
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null,
        "Student record was successfully updated.",
        "Update", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,
        "Unable to update student record. Please see logs.",
        "Update Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Logs: " + e.getMessage());
    }
}

    @Override
    public void deleteStudent(String idno) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "DELETE FROM tbl_student WHERE idnumber = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, idno);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null,
            "Student record was successfully deleted.",
            "Delete", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to delete student record. Please see logs.",
            "Delete Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
        }
    }

    @Override
    public List<Student> searchStudent(String searchKey, String searchString) {
        List<Student> list = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM tbl_student WHERE lastname LIKE ? ORDER BY lastname";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + searchString + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setIdno(rs.getString("idnumber"));
            student.setLastname(rs.getString("lastname"));
            student.setFirstname(rs.getString("firstname"));
            student.setMiddle(rs.getString("middle"));
            student.setAge(rs.getInt("age"));
            student.setGender(rs.getString("gender"));
            student.setDob(rs.getString("dob"));
            student.setAddress(rs.getString("address"));
            list.add(student);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to get list of Students. Please see logs.",
            "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
            }
            return list;
        }

    @Override
    public List<Student> studentList() {
        List<Student> list = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM tbl_student ORDER BY lastname";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setIdno(rs.getString("idnumber"));
            student.setLastname(rs.getString("lastname"));
            student.setFirstname(rs.getString("firstname"));
            student.setMiddle(rs.getString("middle"));
            student.setAge(rs.getInt("age"));
            student.setGender(rs.getString("gender"));
            student.setDob(rs.getString("dob"));
            student.setAddress(rs.getString("address"));
            list.add(student);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to get list of Students. Please see logs.",
            "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
            }
            return list;
        }
    @Override
    public Student getStudent(String idno) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM tbl_student WHERE idnumber = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, idno);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setIdno(rs.getString("idnumber"));
            student.setLastname(rs.getString("lastname"));
            student.setFirstname(rs.getString("firstname"));
            student.setMiddle(rs.getString("middle"));
            student.setAge(rs.getInt("age"));
            student.setGender(rs.getString("gender"));
            student.setDob(rs.getString("dob"));
            student.setAddress(rs.getString("address"));
            return student;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
            "Unable to get list of Students. Please see logs.",
            "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + e.getMessage());
            }
            return null;
        }
}
