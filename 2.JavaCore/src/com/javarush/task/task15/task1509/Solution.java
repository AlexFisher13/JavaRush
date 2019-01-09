package com.javarush.task.task15.task1509;

/* 
Мужчина или женщина?
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {
        System.out.println(human.toString());
    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
