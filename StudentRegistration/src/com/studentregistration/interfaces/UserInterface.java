/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.studentregistration.interfaces;

import com.studentregistration.models.User;
import java.util.List;
/**
 *
 * @author cpe
 */
public interface UserInterface {
    public boolean Login(User user);
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(String idno);
    public List<User> searchUser(String searchKey, String searchString);
    public List<User> userList();
    public User getUser(String idno);
}
