/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Employee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Avishek
 */
@Repository
public class EmployeeImplementation {
    
    @Autowired
    DataSource dataSource;
    
    public Employee getEmployeeById(int empId){
        String query = "{call employeewebapp.getEmployeeById(?);}";
        Connection con;
        CallableStatement cs;
        ResultSet rs;
        Employee emp;
        
        try{
            emp = new Employee();
            con = dataSource.getConnection();
            cs = con.prepareCall(query);
            cs.setInt(1, empId);
            rs = cs.executeQuery();
            
            while(rs.next()){
                emp.setEmpno(rs.getInt("empno"));
                emp.setDeptno(rs.getInt("empdept"));
                emp.setName(rs.getString("empname"));
                emp.setContact(rs.getInt("contact"));
                emp.setUsername(rs.getString("username"));
                emp.setPassword("");
            }
            
            return emp;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
