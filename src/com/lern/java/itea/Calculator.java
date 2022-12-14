package com.lern.java.itea;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) { // гілка STG
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int one = scanner.nextInt();
        int tow = scanner.nextInt();
        int three = scanner.nextInt();

        if (one > 5 && tow > 5 && three > 5) {
            calculator(one, tow, three);
        } else {
            System.out.println("Enter numbers > 5");
        }

    }
    public static void calculator(int one, int tow, int three) {
        int number = 5;
        int resultOne = one/number;
        int resultTow = tow/number;
        int resultThree = three/number;

        System.out.println("resultOne = " + resultOne + ", resultTow = " + resultTow + ", resultThree = " + resultThree);
    }
}
