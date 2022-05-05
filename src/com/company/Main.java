package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat1 = new Cat();
    cat1.setName("Komochek");
    cat1.setGender("Male");
    cat1.setColor("Black");
        System.out.println("\n/         Cat          /" +
                "\nname: "+cat1.getName()+"" +
                "\ncolour: "+cat1.getColor()+"" +
                "\ngender: "+cat1.getGender());
    cat1.cats();

    Dog dog1 = new Dog();
    dog1.setName("Kostochka");
    dog1.setColor("Grey");
    dog1.setGender("Male");
        System.out.println("\n/         Dog          /" +
                "\nname: "+dog1.getName()+"" +
                "\ncolour: "+dog1.getColor()+"" +
                "\ngender: "+dog1.getGender());
    dog1.gods();

    Popugai popugai1 = new Popugai();
    popugai1.setName("Kesha");
    popugai1.setColor("Rainbow");
    popugai1.setGender("Male");
        System.out.println("\n/         Popugai          /" +
                "\nname: "+popugai1.getName()+"" +
                "\ncolour: "+popugai1.getColor()+"" +
                "\ngender: "+popugai1.getGender());
    popugai1.popugai();

    Fish fish1 = new Fish();
    fish1.setName("Oficer Rybkin");
    fish1.setColor("Gold");
    fish1.setGender("Male");
        System.out.println("\n/         Fish          /" +
                "\nname: "+fish1.getName()+"" +
                "\ncolour: "+fish1.getColor()+"" +
                "\ngender: "+fish1.getGender());
    fish1.fish();

    }
}
