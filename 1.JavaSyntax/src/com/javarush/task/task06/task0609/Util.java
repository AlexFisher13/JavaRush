package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = Math.abs(x1 - x2)*Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2)*Math.abs(y1 - y2);
        return Math.sqrt(a+b);
    }

    public static void main(String[] args) {

    }
}
