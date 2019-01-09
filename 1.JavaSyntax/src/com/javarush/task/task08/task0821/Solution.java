package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Люкутан", "Сергей");
        map.put("Люкутан", "Виктория");
        map.put("Гапич", "Виктория");
        map.put("Гапич", "Виктория");
        map.put("Сойникова", "Таня");
        map.put("Тарасенко", "Таня");
        map.put("Абакумова", "Алина");
        map.put("Сидоренко", "Таня");
        map.put("Мурзаков", "Таня");
        map.put("Арсенов", "Максим");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
