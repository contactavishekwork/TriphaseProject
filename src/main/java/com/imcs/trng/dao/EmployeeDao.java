/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Employee;

/**
 *
 * @author Avishek
 */
public interface EmployeeDao {
    public Employee getEmployeeById(int empNo);
}
