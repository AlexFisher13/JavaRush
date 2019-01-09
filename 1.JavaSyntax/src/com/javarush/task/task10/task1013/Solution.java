package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private char sex;
        private boolean f;
        private float weight;
        private double height;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, char sex, boolean f) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.f = f;
        }

        public Human(String name, int age, char sex, boolean f, float weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.f = f;
            this.weight = weight;
        }

        public Human(String name, int age, char sex, boolean f, float weight, double height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.f = f;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, char sex, boolean f) {
            this.name = name;
            this.sex = sex;
            this.f = f;
        }

        public Human(boolean f, float weight) {
            this.f = f;
            this.weight = weight;
        }

        public Human(boolean f, float weight, double height) {
            this.f = f;
            this.weight = weight;
            this.height = height;
        }
    }
}
