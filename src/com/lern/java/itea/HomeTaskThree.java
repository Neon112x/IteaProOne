package com.lern.java.itea;

import java.util.Scanner;

public class HomeTaskThree {
    public static void main(String[] args) {
        Interval();
        Parity();
        LogicOperations();
    }

    public static void Interval() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between: 0 - 100: ");
        int enterNumber = scanner.nextInt();

        if (enterNumber >= 0 && enterNumber <= 14) {
            System.out.println("Number between 0 and 14");
        } else if (enterNumber >= 15 && enterNumber <= 35) {
            System.out.println("Number between 15 and 35");
        } else if (enterNumber >= 36 && enterNumber <= 50) {
            System.out.println("Number between 36 and 50");
        } else if (enterNumber >= 51 && enterNumber <= 100) {
            System.out.println("Number between 51 and 100");
        } else {
            System.out.println("Enter number not equal 0 - 100.");
        }
    }

    public static void Parity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (перевірка на парність): ");
        int enterNumber = scanner.nextInt();

        byte parityByte = (byte) (enterNumber << 7);
        if (parityByte == 0) {
            System.out.println("The number " + enterNumber + " is pair\n Check in byte.");
        } else if (parityByte == -128) {
            System.out.println("The number " + enterNumber + " is not pair\n Check in byte.");
        } else {
            System.out.println("The number " + enterNumber + " outside to check (in byte).");
        }

        long parityLong = (long) (enterNumber << 31);
        if (parityLong == 0) {
            System.out.println("The number " + enterNumber + " is pair\n Check in long.");
        } else if (parityLong == -2147483648) {
            System.out.println("The number " + enterNumber + " is not pair\n Check in long.");
        } else {
            System.out.println("The number " + enterNumber + " outside to check (in long).");
        }

        if (enterNumber % 2 == 0) {
            System.out.println("The number " + enterNumber + " is pair \n% int.");
        } else {
            System.out.println("The number " + enterNumber + " is not pair \n% int.");
        }
    }

    public static void LogicOperations() {
        System.out.println("+++++++++++++++==========+++++++++++++");
        int x = 5;
        int y = 10;
        int z = 15;

        System.out.println(x+= y >> x++ * z);
        System.out.println(z = ++x & y * 5);
        System.out.println(y/= x + 5 | z);
        System.out.println(z= x++ & y * 5);
        System.out.println(x = y << x++^z);

    }
}
