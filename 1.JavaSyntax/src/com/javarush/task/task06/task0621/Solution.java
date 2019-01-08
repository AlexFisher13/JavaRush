package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat catGrandDad = new Cat(grandDadName, null, null);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName, null, null);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, catGrandDad, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMa);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catDad, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catDad, catMother);

        System.out.println(catGrandDad);
        System.out.println(catGrandMa);
        System.out.println(catDad);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat dad;
        private Cat mom;

        public Cat(String name, Cat dad, Cat mom) {
            this.name = name;
            this.dad = dad;
            this.mom = mom;
        }

        @Override
        public String toString() {
            String s = "The cat's name is " + name;
            if (mom == null)
                s = s + ", no mother";
            else
                s = s + ", mother is " + mom.name;
            if (dad == null)
                s = s + ", no father";
            else
                s = s + ", father is " + dad.name;
            return s;
//            if (dad == null)
//                return "The cat's name is " + name + ", no mother ";
//            else
//                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}
