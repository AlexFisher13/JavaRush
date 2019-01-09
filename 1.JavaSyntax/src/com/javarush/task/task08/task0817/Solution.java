package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Люкутан1", "Алина");
        map.put("Люкутан2", "Ева");
        map.put("Гапич3", "Алена");
        map.put("Гапич4", "Ева");
        map.put("Сойникова", "Катя");
        map.put("Тарасенко", "Катя");
        map.put("Абакумова", "Алина");
        map.put("Сидоренко", "Таня");
        map.put("Мурзаков", "Ева");
        map.put("Арсенов", "Максим");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> list = new ArrayList<>(map.values());
        for (int i = 0; i < map.size(); i++) {
            removeItemFromMapByValue(map, list.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);

//        for (String s: map.keySet()) {
//            System.out.println(s + " - " + map.get(s));
//        }
    }
}
