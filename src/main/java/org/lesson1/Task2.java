package org.lesson1;

public class Task2 {
    public static void main(String[] args) {
        int widthTable = 2;
        int lengthTable = 2;
        int widthRoom = 9;
        int lengthRoom = 8;
        int fitTablesInRoom = (widthRoom * lengthRoom) / (widthTable * lengthTable);
        System.out.println(fitTablesInRoom);
    }
}
