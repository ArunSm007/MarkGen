package com.markgen.beans;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class DepartmentDetails {
    private int departmentId;
    private String regulationId;
    private String departmentName;
    private List<SemesterDetails> semesterDetailses;
    private List<ClassDetails> classDetailses;

    public List<SemesterDetails> getSemesterDetailses() {
        return semesterDetailses;
    }

    public void setSemesterDetailses(List<SemesterDetails> semesterDetailses) {
        this.semesterDetailses = semesterDetailses;
    }

    public List<ClassDetails> getClassDetailses() {
        return classDetailses;
    }

    public void setClassDetailses(List<ClassDetails> classDetailses) {
        this.classDetailses = classDetailses;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(String regulationId) {
        this.regulationId = regulationId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
}
