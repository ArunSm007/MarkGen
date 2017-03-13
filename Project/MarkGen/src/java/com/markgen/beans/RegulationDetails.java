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
public class RegulationDetails {
    private String regualationId;
    private int maxTerminalMark;
    private int maxModelMark;
    private int maxAssignmentMark;

    public String getRegualationId() {
        return regualationId;
    }

    public void setRegualationId(String regualationId) {
        this.regualationId = regualationId;
    }

    public int getMaxTerminalMark() {
        return maxTerminalMark;
    }

    public void setMaxTerminalMark(int maxTerminalMark) {
        this.maxTerminalMark = maxTerminalMark;
    }

    public int getMaxModelMark() {
        return maxModelMark;
    }

    public void setMaxModelMark(int maxModelMark) {
        this.maxModelMark = maxModelMark;
    }

    public int getMaxAssignmentMark() {
        return maxAssignmentMark;
    }

    public void setMaxAssignmentMark(int maxAssignmentMark) {
        this.maxAssignmentMark = maxAssignmentMark;
    }
    
    
    
}
