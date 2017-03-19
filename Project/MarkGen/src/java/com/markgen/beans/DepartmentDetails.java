package com.markgen.beans;

import java.util.List;

public class DepartmentDetails {
    private String departmentId;
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
}
