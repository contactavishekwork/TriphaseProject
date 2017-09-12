/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.rest;

import com.imcs.trng.models.Employee;

/**
 *
 * @author Avishek
 */
public interface EmployeeRestService {

    String redirectURL = "http://localhost:8081/rest/employee";

    public Employee getEmployeeInfoById(int empNo);

    public Employee[] getEmployeeList();

    public boolean addEmployee(Employee emp);

    public boolean deleteEmployee(int empNo);
    
    public boolean updateEmployee(Employee emp);
}
