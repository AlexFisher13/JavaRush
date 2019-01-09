package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Люкутан1", 6);
        map.put("Люкутан2", 5);
        map.put("Гапич3", 1111);
        map.put("Гапич4", 2222);
        map.put("Сойникова", 44);
        map.put("Тарасенко", 444);
        map.put("Абакумова", 433);
        map.put("Сидоренко", 6666);
        map.put("Мурзаков", 333);
        map.put("Арсенов", 222);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}