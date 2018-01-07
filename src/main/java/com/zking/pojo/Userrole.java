package com.zking.pojo;

public class Userrole {

    public Userrole() {
        super();
    }

    public Userrole(int rid, int mmid) {
        this.rid = rid;
        this.mmid = mmid;
    }

    private  int  rid;


    private  int  mmid;


    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getMmid() {
        return mmid;
    }

    public void setMmid(int mmid) {
        this.mmid = mmid;
    }
}
