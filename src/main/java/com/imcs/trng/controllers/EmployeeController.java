/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.controllers;

import com.imcs.trng.models.Employee;
import com.imcs.trng.rest.EmployeeRestServiceImpl;
import java.awt.PageAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Avishek
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRestServiceImpl empService;
    
    @RequestMapping(method=RequestMethod.GET, value="{/id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getEmployeeInfoById(@PathVariable("id")int empNo){
        Employee emp = empService.getEmployeeInfoById(empNo);
        
        if(emp != null && emp.getEmpno() != 0)
            return new ResponseEntity<>(emp, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    
    
    @RequestMapping(method=RequestMethod.GET, value = "/dept/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Employee[] getEmployeeList(){
        Employee[] empList = empService.getEmployeeList();
        return empList;
    }
    
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public  @ResponseBody boolean addEmployee(@RequestBody Employee emp){
        return empService.addEmployee(emp);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "{/id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody boolean updateEmployee(@RequestBody Employee emp){
        return empService.updateEmployee(emp);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "{/id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody boolean deleteEmployee(@PathVariable("id")int empNo){
        return empService.deleteEmployee(empNo);
    }
}
