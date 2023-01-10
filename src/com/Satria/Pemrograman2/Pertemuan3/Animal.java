package com.Satria.Pemrograman2.Pertemuan3;

public class Animal {
    // Attribute
    private String name;
    private int age;

    // Constructor
    public Animal() {
    }

    //Cara cepat : [Alt] + [Insert] = Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter & Setter
    //Cara cepat [Alt] + [Insert] = Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method (Function)
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");

    }
}
