package com.markgen.beans;

import java.util.List;

public class ClassDetails {
    private String classId;
    private String section;
    private int year;
    private String regulationId;
    private List<ClassStudentDetails> studentsId;
    private List<SubjectHandlingFacultyDetails> faculties;
    private List<SubjectStudentDetails> subjectStudentsList;
    private List<AdvisorDetails> advisorDetails;
    private List<StudentList> studentLists;

    public List<StudentList> getStudentLists() {
        return studentLists;
    }

    public void setStudentLists(List<StudentList> studentLists) {
        this.studentLists = studentLists;
    }
    
    public String getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(String regulationId) {
        this.regulationId = regulationId;
    }

    public List<AdvisorDetails> getAdvisorDetails() {
        return advisorDetails;
    }

    public void setAdvisorDetails(List<AdvisorDetails> advisorDetails) {
        this.advisorDetails = advisorDetails;
    }

    public List<SubjectHandlingFacultyDetails> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<SubjectHandlingFacultyDetails> faculties) {
        this.faculties = faculties;
    }

    public List<SubjectStudentDetails> getSubjectStudentsList() {
        return subjectStudentsList;
    }

    public void setSubjectStudentsList(List<SubjectStudentDetails> subjectStudentsList) {
        this.subjectStudentsList = subjectStudentsList;
    }

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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
}
