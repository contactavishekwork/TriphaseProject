/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Department;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Avishek
 */
@Entity
@NamedQuery(name = "Employee", query = "from department d where d.deptid=?1")
public interface DepartmentDao extends CrudRepository<Department, Integer>{
    public Department getDeptById(int deptId);
}
