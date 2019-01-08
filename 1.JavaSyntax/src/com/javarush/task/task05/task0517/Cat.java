package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 20;
        this.color = "red";
        this.age = 10;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 20;
        this.age = age;
        this.color = "red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 10;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
