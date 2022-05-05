package com.company;

public class Fish {
    private String name;
    private String gender;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void fish(){
        System.out.println(name+" плавает в аквариуме.");
    }
}
