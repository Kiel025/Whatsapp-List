package com.kiel.whatsapplist.model;

public class User {

    private int pic;
    private String name;

    public User(int pic, String name, String message) {
        this.pic = pic;
        this.name = name;
        this.message = message;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

}
