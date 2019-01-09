package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Arnold", df.parse("JANUARY 1 1980"));
        map.put("Jom", df.parse("JUNE 1 1980"));
        map.put("Jeki chan", df.parse("JUNE 1 1980"));
        map.put("Jim kerri", df.parse("JUNE 1 1980"));
        map.put("Steve Jobs", df.parse("JANUARY 1 1980"));
        map.put("Tim kuk", df.parse("JUNE 1 1980"));
        map.put("dfsdf", df.parse("JUNE 1 1980"));
        map.put("Arnoldfsd", df.parse("JUNE 1 1980"));
        map.put("Jodddm", df.parse("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Calendar cal = new GregorianCalendar();

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            cal.setTime(pair.getValue());
            if (cal.getTime().getMonth() >= 5 & cal.getTime().getMonth() <= 7) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
    }
}
