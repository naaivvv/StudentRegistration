/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentregistration.models;

/**
 *
 * @author cpe
 */
public class User {
    private int id;
    private String idno;
    private String uname;
    private String pwd;
    private String fullname;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getIdno() {
    return idno;
    }
    public void setIdno(String idno) {
    this.idno = idno;
    }
    public String getUname() {
    return uname;
    }
    public void setUname(String uname) {
    this.uname = uname;
    }
    public String getPwd() {
    return pwd;
    }
    public void setPwd(String pwd) {
    this.pwd = pwd;
    }
    public String getFullname() {
    return fullname;
    }
    public void setFullname(String fullname) {
    this.fullname = fullname;
    }
}
