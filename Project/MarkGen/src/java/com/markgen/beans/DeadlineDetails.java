/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.markgen.beans;

import java.util.Date;

/**
 *
 * @author Arun
 */
public class DeadlineDetails {
    int pno;
    int semno;
    int year;
    Date lastDate;
    Date fromDate;
    String detType;

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public int getSemno() {
        return semno;
    }

    public void setSemno(int semno) {
        this.semno = semno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public String getDetType() {
        return detType;
    }

    public void setDetType(String detType) {
        this.detType = detType;
    }
    
}
