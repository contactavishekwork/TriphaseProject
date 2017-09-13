/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Avishek
 */

@Entity
@Table(name="department")
public class Department implements Serializable {
    
    private static final long SERIAL_VERSION = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="deptid")
    private int deptNo;
    
    @Size(min=1,max=45)
    @Column(name="deptname")
    private String deptName;
    
    @Size(min=1,max=45)
    @Column(name="deptlocation")
    private String deptLocation;

    /**
     * @return the deptLocation
     */
    public String getDeptLocation() {
        return deptLocation;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @return the deptNo
     */
    public int getDeptNo() {
        return deptNo;
    }

    /**
     * @param deptLocation the deptLocation to set
     */
    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @param deptNo the deptNo to set
     */
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    
    
}
