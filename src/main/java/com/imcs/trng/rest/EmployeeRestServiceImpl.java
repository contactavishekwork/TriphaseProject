/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.rest;

import com.imcs.trng.models.Employee;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeRestServiceImpl implements EmployeeRestService {

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Employee getEmployeeInfoById(int empNo) {
        ResponseEntity respEmpEntity = restTemplate.getForEntity(redirectURL + "/" + Integer.toString(empNo), Employee.class);
        
        return respEmpEntity.getStatusCode() == HttpStatus.OK ? (Employee) respEmpEntity.getBody(): null;
    }

    @Override
    public Employee[] getEmployeeList() {
        ResponseEntity<Employee[]> respEmpEntityList = restTemplate.getForEntity(redirectURL + "/employees/", Employee[].class);

        return respEmpEntityList.getStatusCode() == HttpStatus.OK ? (Employee[]) respEmpEntityList.getBody(): null;
    }

    @Override
    public boolean addEmployee(Employee emp) {
        HttpEntity<Employee> empRequest = new HttpEntity<>(emp);
        ResponseEntity<Employee> empResponseEntity = restTemplate.postForEntity(redirectURL + "/add", empRequest, Employee.class);

        return empResponseEntity.getStatusCode() == HttpStatus.OK;
    }

    @Override
    public boolean deleteEmployee(int empNo) {
        ResponseEntity<Employee> empResponseEntity
                = restTemplate.exchange(redirectURL + "/" + Integer.toString(empNo), HttpMethod.DELETE, null, Employee.class);
        return empResponseEntity.getStatusCode() == HttpStatus.OK;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        HttpEntity<Employee> empRequest = new HttpEntity(emp);
        ResponseEntity<Employee> empResponseEntity = restTemplate.exchange(redirectURL + "/update", HttpMethod.PUT, empRequest, Employee.class);
        return empResponseEntity.getStatusCode() == HttpStatus.OK;
    }

}
