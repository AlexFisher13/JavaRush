package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map =  new HashMap<>();
        Cat cat1 = new Cat("a");
        Cat cat2 = new Cat("b");
        Cat cat3 = new Cat("c");
        Cat cat4 = new Cat("d");
        Cat cat5 = new Cat("e");
        Cat cat6 = new Cat("f");
        Cat cat7 = new Cat("g");
        Cat cat8 = new Cat("h");
        Cat cat9 = new Cat("r");
        Cat cat0 = new Cat("t");

        map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);
        map.put(cat0.name, cat0);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();

        for (Map.Entry<String, Cat> pair: map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
