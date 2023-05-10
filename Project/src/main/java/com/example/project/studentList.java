package com.example.project;

public class studentList {
    Integer StudentID ;
        String StudentNAME , DEPARTMENT , PHNno , ROOMno, SESSION , ADDRESS ,BLOODGroup ;

    public studentList(Integer StudentID, String StudentNAME, String DEPARTMENT, String PHNno, String ROOMno, String SESSION, String ADDRESS, String BLOODGroup) {
        this.StudentID = StudentID;
        this.StudentNAME = StudentNAME;
        this.DEPARTMENT = DEPARTMENT;
        this.PHNno = PHNno;
        this.ROOMno = ROOMno;
        this.SESSION = SESSION;
        this.ADDRESS = ADDRESS;
        this.BLOODGroup = BLOODGroup;
    }

    public Integer getStudentID() {
        return StudentID;
    }

    public String getStudentNAME() {
        return StudentNAME;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public String getPHNno() {
        return PHNno;
    }

    public String getROOMno() {
        return ROOMno;
    }

    public String getSESSION() {
        return SESSION;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public String getBLOODGroup() {
        return BLOODGroup;
    }

    public void setStudentID(Integer studentID) {
        StudentID = studentID;
    }

    public void setStudentNAME(String studentNAME) {
        StudentNAME = studentNAME;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public void setPHNno(String PHNno) {
        this.PHNno = PHNno;
    }

    public void setROOMno(String ROOMno) {
        this.ROOMno = ROOMno;
    }

    public void setSESSION(String SESSION) {
        this.SESSION = SESSION;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public void setBLOODGroup(String BLOODGroup) {
        this.BLOODGroup = BLOODGroup;
    }
}
