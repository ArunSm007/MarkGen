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
    private int year;
    private List<ClassStudentDetails> studentsId;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<ClassStudentDetails> getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(List<ClassStudentDetails> studentsId) {
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
    
}
