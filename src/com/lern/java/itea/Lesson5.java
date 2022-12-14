package com.lern.java.itea;

public class Lesson5 {
    public static void main(String[] args) {
        int[] listOne = {1,1,1,1};
        int[] listTow = {2,2,2,2};
        int result[] = new int[listOne.length];

        for (int i = 0; i < listOne.length; i++) {
            result[i] = listOne[i] + listTow[i];
            System.out.println(result[i]);
        }
    }
}
