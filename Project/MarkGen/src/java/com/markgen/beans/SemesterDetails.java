/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.markgen.beans;

import java.util.List;

public class SemesterDetails {
    private int sno;
    private int year;
    private int semesterNo;
    private List<SubjectList> subjectLists;

    public List<SubjectList> getSubjectLists() {
        return subjectLists;
    }

    public void setSubjectLists(List<SubjectList> subjectLists) {
        this.subjectLists = subjectLists;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    
}
