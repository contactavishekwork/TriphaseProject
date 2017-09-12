/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.rest;

import com.imcs.trng.models.Department;
import com.imcs.trng.models.Employee;

/**
 *
 * @author Avishek
 */
public interface DepartmentRestService {

    String redirectURL = "http://localhost:8081/rest/department";

    public Department getDeptInfoById(int deptId);

    public Employee[] getEmployeeByDeptId(int deptId);
}
