package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat1 = new Cat();
    cat1.setName("Komochek");
    cat1.setGender("Male");
    cat1.setColor("Black");
    cat1.cats();

    Dog dog1 = new Dog();
    dog1.setName("Kostochka");
    dog1.setColor("Grey");
    dog1.setGender("Male");
    dog1.gods();

    Popugai popugai1 = new Popugai();
    popugai1.setName("Kesha");
    popugai1.setColor("Rainbow");
    popugai1.setGender("Male");
    popugai1.popugai();

    Fish fish1 = new Fish();
    fish1.setName("Oficer Rybkin");
    fish1.setColor("Gold");
    fish1.setGender("Male");
    fish1.fish();

    }
}
