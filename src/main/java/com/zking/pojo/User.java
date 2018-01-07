package com.zking.pojo;

public class User {


    public User() {
        super();
    }


    public User(int id, String designation, String password, int rid) {
        this.id = id;
        this.designation = designation;
        this.password = password;
        this.rid = rid;
    }

    private  int   id;



    private  String designation;


    private  String password;


    private  int  rid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
