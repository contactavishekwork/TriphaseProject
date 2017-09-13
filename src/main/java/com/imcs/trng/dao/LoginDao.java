/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Employee;
import com.imcs.trng.models.Login;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Avishek
 */
@Entity
@NamedQuery(name = "Employee", query = "from employee e where e.empno=?")
public interface LoginDao extends CrudRepository<Employee, Integer>{
    public Login findByUsername(String username);
}
