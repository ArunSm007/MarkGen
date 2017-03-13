/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.markgen.beans;

import java.util.List;

/**
 *
 * @author Arun
 */
public class SemesterDetails {
    private int sno;
    private List<SubjectDetails> subjectDetailses;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public List<SubjectDetails> getSubjectDetailses() {
        return subjectDetailses;
    }

    public void setSubjectDetailses(List<SubjectDetails> subjectDetailses) {
        this.subjectDetailses = subjectDetailses;
    }
    
}
