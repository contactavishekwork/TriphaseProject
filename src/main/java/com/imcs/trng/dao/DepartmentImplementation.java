/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Department;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Avishek
 */
@Repository
public class DepartmentImplementation {
    
    @Autowired
    DataSource dataSource;
    
    public Department getDepartmentById(int deptId){
        String query = "{call employeewebapp.getDeptInfoById(?);}";
        Connection con;
        CallableStatement cs;
        ResultSet rs;
        Department dept;
        
        try{
            dept = new Department();
            con = (Connection) dataSource.getConnection();
            cs = (CallableStatement) con.prepareCall(query);
            cs.setInt(1, deptId);
            rs = cs.executeQuery();
            
            while(rs.next()){
                dept.setDeptNo(rs.getInt("deptid"));
                dept.setDeptName(rs.getString("deptname"));
                dept.setDeptLocation(rs.getString("deptlocation"));
            }
            return dept;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
