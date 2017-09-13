/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.dao;

import com.imcs.trng.models.Employee;
import com.imcs.trng.models.Login;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Avishek
 */
@Deprecated
public class LoginImplementation {
//
////    @Autowired
////    DataSource dataSouce;
//    @PersistenceContext
//    private EntityManager em;
//
//    public void setEntityManager(EntityManager em) {
//        this.em = em;
//    }
//
//    public Login getLogin(String username) {
//        CriteriaQuery<Login> query = em.getCriteriaBuilder().createQuery(Login.class);
//        query.select(query.from(Login.class));
//        
//        return (Login) em.createQuery(query).getResultList();
//    }
}
