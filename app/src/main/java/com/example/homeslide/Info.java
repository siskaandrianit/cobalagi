package com.example.homeslide;

public class Info {
    private int id;
    private String title;
    private String shortdesc;
    private int image;


    public Info(int id, String title, String shortdesc, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
    public int getImage() {
        return image;
    }

}

