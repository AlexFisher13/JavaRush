package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Protoss pro1 = new Protoss();
        Protoss pro2 = new Protoss();
        Protoss pro3 = new Protoss();
        Terran ter1 = new Terran();
        Terran ter2 = new Terran();
        Terran ter3 = new Terran();
        Terran ter4 = new Terran();
        zerg1.name = "dsf";
        zerg2.name = "df";
        zerg3.name = "ghgf";
        zerg4.name = "fgf";
        zerg5.name = "gfdd";
        pro1.name = "fdrrt";
        pro2.name = "45fd";
        pro3.name = "ghfkhg";
        ter1.name = "dsdfhfd";
        ter2.name = "fdfg";
        ter3.name = "fgdf";
        ter4.name = "fgfg";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
