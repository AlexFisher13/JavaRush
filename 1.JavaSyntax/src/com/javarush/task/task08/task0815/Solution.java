package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Люкутан1", "Сергей");
        map.put("Люкутан2", "Виктория");
        map.put("Гапич3", "Алена");
        map.put("Гапич4", "Ева");
        map.put("Сойникова", "Катя");
        map.put("Тарасенко", "Катя");
        map.put("Абакумова", "Алина");
        map.put("Сидоренко", "Таня");
        map.put("Мурзаков", "Вадим");
        map.put("Арсенов", "Максим");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (String s: map.values()) {
            if (s.equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String s: map.keySet()) {
            if (s.equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
