package com.example.shelter.model;

import java.util.Date;


public class Health {
    private int id;
    private int a_id;
    private int u_id;
    private String health_info;
    private Date date;
    private String remarks;

    public Health(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getHealth_info() {
        return health_info;
    }

    public void setHealth_info(String health_info) {
        this.health_info = health_info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
