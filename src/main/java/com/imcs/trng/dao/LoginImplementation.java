/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Login;
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
public class LoginImplementation {
    
    @Autowired
    DataSource dataSouce;
    
    public Login getLogin(String username){
        String query = "{call employeewebapp.loginProcedure(?)}";
        Connection con;
        CallableStatement cs;
        ResultSet rs;
        Login login = null;
        
        try{
            con = (Connection) dataSouce.getConnection();
            cs = (CallableStatement) con.prepareCall(query);
            cs.setString(1, username);
            rs = cs.executeQuery();
            
            while(rs.next()){
                login.setUsername(rs.getString("username"));
                login.setPassword(rs.getString("password"));
            }
            
            return login;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
