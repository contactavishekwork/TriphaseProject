/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.rest;

import com.imcs.trng.models.Department;
import com.imcs.trng.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepartmentRestServiceImpl implements DepartmentRestService {

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Department getDeptInfoById(int deptId) {

        ResponseEntity<Department> deptRespEntity = restTemplate.getForEntity(redirectURL + "/" + Integer.toString(deptId), Department.class);

        return deptRespEntity.getStatusCode() == HttpStatus.OK ? deptRespEntity.getBody(): null;
    }

    @Override
    public Employee[] getEmployeeByDeptId(int deptId) {
        ResponseEntity<Employee[]> deptEntity = restTemplate.getForEntity(redirectURL+"/employees/"+Integer.toString(deptId), Employee[].class);
        
        return deptEntity.getStatusCode() == HttpStatus.OK ? deptEntity.getBody(): null;
        
    }

}
