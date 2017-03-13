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
  private int parentId;
   private int yearOfJoining;

    public int getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public int getParentId() {
        return parentId;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String Department) {
        this.department = Department;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setYearOfJoining(int YearOfJoining) {
        this.yearOfJoining = YearOfJoining;
    }
    
}
