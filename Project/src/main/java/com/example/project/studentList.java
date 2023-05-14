package com.example.project;

public class studentList {
        Integer Session ,RegistrationNo,ROOMno,GurdianPHNno,studentPhn;
        String StudentNAME , DEPARTMENT , BLOODGroup,  ADDRESS , Email ;


    public studentList(String studentName, String department, int sessionStudent, int regestrationNo, String bloodGrp, int roomNo, int gurdiansPhoneNumber, int studentPhnNum, String homeTown, String studentEmail) {
        this.StudentNAME = studentName ;
        this.DEPARTMENT = department ;
        this.Session =  sessionStudent ;
        this.RegistrationNo = regestrationNo ;
        this.BLOODGroup = bloodGrp ;
        this.ROOMno = roomNo ;
        this.GurdianPHNno = gurdiansPhoneNumber;
        this.studentPhn = studentPhnNum;
        this.ADDRESS = homeTown ;
        this.Email =studentEmail ;
    }

    public Integer getSession() {
        return Session;
    }

    public Integer getRegistrationNo() {
        return RegistrationNo;
    }

    public Integer getROOMno() {
        return ROOMno;
    }

    public Integer getGurdianPHNno() {
        return GurdianPHNno;
    }

    public Integer getStudentPhn() {
        return studentPhn;
    }

    public String getStudentNAME() {
        return StudentNAME;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public String getBLOODGroup() {
        return BLOODGroup;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public String getEmail() {
        return Email;
    }

    public void setSession(Integer session) {
        Session = session;
    }

    public void setRegistrationNo(Integer registrationNo) {
        RegistrationNo = registrationNo;
    }

    public void setROOMno(Integer ROOMno) {
        this.ROOMno = ROOMno;
    }

    public void setGurdianPHNno(Integer gurdianPHNno) {
        GurdianPHNno = gurdianPHNno;
    }

    public void setStudentPhn(Integer studentPhn) {
        this.studentPhn = studentPhn;
    }

    public void setStudentNAME(String studentNAME) {
        StudentNAME = studentNAME;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public void setBLOODGroup(String BLOODGroup) {
        this.BLOODGroup = BLOODGroup;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
