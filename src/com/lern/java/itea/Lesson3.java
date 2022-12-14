package com.lern.java.itea;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть число: ");
        int number = scanner.nextInt();
        CaseTow(number);

    }

    public static void CaseTow(int number) {
        switch (number) {
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("B+");
                break;
            case 4:
                System.out.println("A");
                break;
            case 5:
                System.out.println("A+");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void CaseThree(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
            default:
                System.out.println("Error");
        }
    }

}
