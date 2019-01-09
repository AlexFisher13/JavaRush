package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : abcArray) {
            map.put(c, 0);
        }

        for (String s : list) {
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (map.containsKey(c[i])) {
                    map.put(c[i], map.get(c[i]) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
