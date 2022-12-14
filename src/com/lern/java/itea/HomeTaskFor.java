package com.lern.java.itea;

import java.util.Scanner;

public class HomeTaskFor {
    public static void main(String[] args) {
        SumMin();
        TaskTow();
        TaskThree();
        TaskFour();
    }

    public static void SumMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int numberA = scanner.nextInt();

        System.out.print("Enter number B: ");
        int numberB = scanner.nextInt();

        if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                System.out.println(i);
            }
            for (int i = numberA; i <= numberB; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd number:" + i);
                }
            }
        } else {
            System.out.println("Number A not less than number B");
        }
    }

    public static void TaskTow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 9: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 0 && userNumber < 10) {
            for (int i = 1; i < 11; i++) {
                int result = userNumber * i;
                System.out.println(userNumber + " * " + i + " = " + result);
            }
        } else {
            System.out.println("Enter number not equal 1 - 9");
        }
    }

    public static void TaskThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        long enterNumber = scanner.nextLong();
        long count = 0;

        while (enterNumber > 0) {
            long number = enterNumber % 10;
            enterNumber /= 10;
            count += 1;
            System.out.print(number);
            if (count == 3) {
                System.out.print(" ");
                System.out.println();
                count = 0;
            }
        }
    }

    public static void TaskFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number rows: ");

        int rows = scanner.nextInt();

        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
