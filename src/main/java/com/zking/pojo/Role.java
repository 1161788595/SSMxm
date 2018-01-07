package com.zking.pojo;

public class Role {

    public Role() {
        super();
    }

    public Role(int id, String character) {
        this.id = id;
        this.character = character;
    }

    private  int  id;


    private String  character;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
