/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.studentregistration.interfaces;

import com.studentregistration.models.Student;
import java.util.List;

/**
 *
 * @author cpe
 */
public interface StudentInterface {
    public void saveStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(String idno);
    public List<Student> searchStudent(String searchKey, String searchString);
    public List<Student> studentList();
    public Student getStudent(String idno);
}
