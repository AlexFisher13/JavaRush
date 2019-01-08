package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandDad1 = new Human("Джо", true, 85);
        Human grandDad2 = new Human("Кен", true, 86);
        Human grandMa1 = new Human("Мала", false, 87);
        Human grandMa2 = new Human("Джули", false, 88);
        Human mother = new Human("Саша", false,24, grandDad1, grandMa1);
        Human father = new Human("Юля", true, 26, grandDad2, grandMa2);
        Human son1 = new Human("Тимур", true, 10, father, mother);
        Human son2 = new Human("Алиса", false, 5, father, mother);
        Human son3 = new Human("Артур", true, 1, father, mother);

        System.out.println(grandDad1);
        System.out.println(grandDad2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}