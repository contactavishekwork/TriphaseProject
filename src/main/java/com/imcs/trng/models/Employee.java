/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.models;

/**
 *
 * @author Avishek
 */
public class Employee {
    private int empno;
    private int deptno;
    private String name;
    private int contact;
    private String username;
    private String password;

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @return the deptno
     */
    public int getDeptno() {
        return deptno;
    }

    /**
     * @return the empno
     */
    public int getEmpno() {
        return empno;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    /**
     * @param deptno the deptno to set
     */
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    /**
     * @param empno the empno to set
     */
    public void setEmpno(int empno) {
        this.empno = empno;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
