package com.markgen.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class StudentDetails {
    private int studentId;
    private String department;
    private ParentDetails parentDetails;
    private int yearOfJoining;
    private PersonalDetails personalDetails;

    public ParentDetails getParentDetails() {
        return parentDetails;
    }

    public void setParentDetails(ParentDetails parentDetails) {
        this.parentDetails = parentDetails;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String Department) {
        this.department = Department;
    }
    
}
