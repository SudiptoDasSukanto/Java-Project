package com.example.project;

public class stuffList {
    Integer  ID,ROOMno,stuffPhn;
    String NAME  , BLOODGroup,  ADDRESS , Email , work ;

    public stuffList(Integer ID, Integer ROOMno, Integer stuffPhn, String NAME, String BLOODGroup, String ADDRESS, String email, String work) {
        this.ID = ID;
        this.ROOMno = ROOMno;
        this.stuffPhn = stuffPhn;
        this.NAME = NAME;
        this.BLOODGroup = BLOODGroup;
        this.ADDRESS = ADDRESS;
        Email = email;
        this.work = work;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setROOMno(Integer ROOMno) {
        this.ROOMno = ROOMno;
    }

    public void setStuffPhn(Integer stuffPhn) {
        this.stuffPhn = stuffPhn;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
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

    public void setWork(String work) {
        this.work = work;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getROOMno() {
        return ROOMno;
    }

    public Integer getStuffPhn() {
        return stuffPhn;
    }

    public String getNAME() {
        return NAME;
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

    public String getWork() {
        return work;
    }
}
