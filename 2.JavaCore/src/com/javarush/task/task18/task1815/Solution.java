package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        TableInterface compomemt;

        public TableInterfaceWrapper(TableInterface compomemt) {
            this.compomemt = compomemt;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            compomemt.setModel(rows);
        }

        @Override
        public String getHeaderText() {
           return compomemt.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            compomemt.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}