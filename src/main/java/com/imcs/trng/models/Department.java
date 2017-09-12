/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imcs.trng.models;

/**
 *
 * @author Avishek
 */
public class Department {
    private int deptNo;
    private String deptName;
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
