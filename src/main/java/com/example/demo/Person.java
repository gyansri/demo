package com.example.demo;

public class Person implements AB {
    private int age;
    private int id;
    private String name;


    public void test() {

    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        System.out.println("args = " + args);
    }

    public Person(int age, int id) {
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

interface AB {
    void test();
}
