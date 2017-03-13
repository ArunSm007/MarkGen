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
public class ClassDetails {
    private String classId;
    private int section;
    private String departmentId;
    private List<String> studentsId;

    public List<String> getStudentsId() {
        return studentsId;
    }

    public void setStudentId(List<String> studentsId) {
        this.studentsId = studentsId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    
}
