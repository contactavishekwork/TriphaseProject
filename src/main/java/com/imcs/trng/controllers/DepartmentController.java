/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.controllers;

import com.imcs.trng.models.Department;
import com.imcs.trng.models.Employee;
import com.imcs.trng.rest.DepartmentRestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Avishek
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentRestServiceImpl deptService;
    
    @RequestMapping(method = RequestMethod.GET, value = "{/id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getDeptByInfo(@PathVariable("id")int deptId){
        Department dept = null;
        dept = deptService.getDeptInfoById(deptId);
        
        return (!dept.equals(null) && deptId != 0)? new ResponseEntity<>(dept, HttpStatus.OK): new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "{/id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employee[] getEmployeeById(@PathVariable("id")int deptId){
        Employee[] empList = deptService.getEmployeeByDeptId(deptId);
        
        if (empList.equals(null)){
            return null;
        }else
            return empList;
    }
}
