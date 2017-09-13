/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.triplephaseproject;

/**
 *
 * @author Avishek
 */
public class TestPhase1 {
    public static void main(String[] args) {
        new com.imcs.trng.dao.DepartmentImplementation().getDeptById(1).toString();
        new com.imcs.trng.dao.EmployeeImplementation().getEmployeeById(1).toString();
        new com.imcs.trng.dao.LoginDaoImpl().findByUsername("avishek").toString();
    }    
}
