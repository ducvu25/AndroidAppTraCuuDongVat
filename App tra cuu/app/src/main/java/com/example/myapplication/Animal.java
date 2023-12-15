package com.example.myapplication;

public class Animal {
    String name;
    String information;
    int img;

    public Animal(String name, String information, int img) {
        this.name = name;
        this.information = information;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public int getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
