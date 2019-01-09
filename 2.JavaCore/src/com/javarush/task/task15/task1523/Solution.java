package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    String a;
    int g;
    short n;

    public static void main(String[] args) {

    }

    public Solution() {
    }

    Solution(String a) {
        this.a = a;
    }

    protected Solution(String a, int g) {
        this.a = a;
        this.g = g;
    }

    private Solution(String a, int g, short n) {
        this.a = a;
        this.g = g;
        this.n = n;
    }
}

