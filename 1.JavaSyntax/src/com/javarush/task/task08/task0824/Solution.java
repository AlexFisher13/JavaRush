package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // два дедушки, две бабушки, отец, мать, трое детей.
        ArrayList<Human> nu = new ArrayList<Human>();
        Human son1 = new Human("dfdgsf", true, 5, nu);
        Human son2 = new Human("dfdgff", false, 5, nu);
        Human son3 = new Human("dfdfdf", true, 5, nu);
        ArrayList<Human> sons = new ArrayList<Human>();
        sons.add(son1);
        sons.add(son2);
        sons.add(son3);
        Human mom = new Human("dfssdfdf", false, 25, sons);
        Human dad = new Human("dsfssdfdf", true, 25, sons);
        ArrayList<Human> mama = new ArrayList<Human>();
        mama.add(mom);
        ArrayList<Human> papa = new ArrayList<Human>();
        papa.add(dad);
        Human grandMa1 = new Human("dfd", false, 85, mama);
        Human grandDad1 = new Human("dfd", true, 85, mama);
        Human grandMa2 = new Human("dfd", false, 85, papa);
        Human grandDad2 = new Human("dfd", true, 85, papa);

        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(grandMa1);
        System.out.println(grandDad1);
        System.out.println(grandMa2);
        System.out.println(grandDad2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
