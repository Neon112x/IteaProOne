package com.lern.java.itea;

import java.util.Scanner;

public class HomeTaskTow {
    public static void main(String[] args) {

        TaskOne(); // Куб по Герону (скопіював з попередньої ДЗ)
        TaskTow(); // ПІБ ( Оновлений функціонал)) )
        TaskThree(); // З голови, розібрав)
        TaskFour(); // менше та більше з двох чисел
        TaskFive(); // менше середнє та більше з трьох чисел
        TaskSix(); // ранок, день та ніч
        TaskSeven(); // калькулятор
        TaskEight();// Задача с двумя звездочками создать программу по вычислению дискриминанта.
    }

    public static void TaskOne() {
        double cubeSide = 5;
        double diagonal = cubeSide * Math.sqrt(2);

        // формула Герона для одного трикутника з куба
        double p = ((cubeSide + cubeSide + diagonal) / 2);
        double SOne = Math.sqrt(p * (p - cubeSide) * (p - cubeSide) * (p - diagonal));

        double SAll = SOne * 12;
        double V = Math.pow(cubeSide, 3);

        System.out.println("S cube = " + SAll);
        System.out.println("V cube = " + V);
    }


    public static void TaskTow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yor first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter yor last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Entre yor surname: ");
        String surname = scanner.nextLine();

        System.out.println("What yor favorite programing language?");
        String favoriteLanguage = scanner.nextLine();

        System.out.println("What yor age?");
        String age = scanner.nextLine();

        System.out.println("What salary yor need?");
        String salary = scanner.nextLine();

        System.out.println("Last name: " + lastName + "\n" + "First name: " + firstName + "\n" + "Surname: " + surname + "\n" +
                "Favorite programing language: " + favoriteLanguage);

        System.out.println(lastName + " " + firstName + " " + surname);
        System.out.println("Yor age: " + age + ", Need salary: " + salary + " $");
    }

    public static void TaskThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int count = number % 10;
            number = number / 10;
            sum += count;
        }
        System.out.println("Sum enter numbers equal: " + sum);
    }

    public static void TaskFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numOne = scanner.nextInt();

        System.out.println("Enter number tow: ");
        int numTow = scanner.nextInt();

        int minNumber = Math.min(numOne, numTow);
        int maxNumber = Math.max(numOne, numTow);

        if (numOne != numTow) {
            System.out.println("Min number = " + minNumber);
            System.out.println("Max number = " + maxNumber);
        } else {
            System.out.println("Number one: " + numOne + " is equal number tow: " + numTow);
        }
    }

    public static void TaskFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numOne = scanner.nextInt();

        System.out.println("Enter number tow: ");
        int numTow = scanner.nextInt();

        System.out.println("Enter number three: ");
        int numThree = scanner.nextInt();

        int minNumber = Math.min(numOne, Math.min(numTow, numThree));
        int maxNumber = Math.max(numOne, Math.max(numTow, numThree));
        int averageNumber = 0;
        if (minNumber == numOne && maxNumber == numTow) {
            averageNumber = numThree;
        }
        if (minNumber == numOne && maxNumber == numThree) {
            averageNumber = numTow;
        }
        if (minNumber == numTow && maxNumber == numOne) {
            averageNumber = numThree;
        }
        if (minNumber == numTow && maxNumber == numThree) {
            averageNumber = numOne;
        }
        if (minNumber == numThree && maxNumber == numOne) {
            averageNumber = numTow;
        }
        if (minNumber == numThree && maxNumber == numTow) {
            averageNumber = numOne;
        }

        if (numOne != numTow & numTow != numThree & numOne != numThree) {
            System.out.println("Min number = " + minNumber);
            System.out.println("Average number = " + averageNumber);
            System.out.println("Max number = " + maxNumber);
        } else {
            System.out.println("Tow or more equals number");
        }
    }

    public static void TaskSix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it now?");
        int time = scanner.nextInt();

        switch (time) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.println("Good morning");
                break;
            case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                System.out.println("Good day");
                break;
            case 20: case 21: case 22: case 23: case 24:
                System.out.println("Good night");
                break;
            default:
                System.out.println("Choose between: 0 - 24");
        }
    }

    public static void TaskSeven() {
        char action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вести перше число:");
        double numOne = scanner.nextDouble();

        System.out.println("Вести оператор: (*,/,+,-)");
        action = scanner.next().charAt(0);

        System.out.println("Вести друге число:");
        double numTow = scanner.nextDouble();

        double result = 0;

        switch (action) {
            case '*':
                result = numOne * numTow;
                break;
            case '/':
                result = numOne / numTow;
                break;
            case '+':
                result = numOne + numTow;
                break;
            case '-':
                result = numOne - numTow;
            default:
                System.out.println("Спробуйте знову.");
        }

        System.out.println(numOne + " " + action + " " + numTow + " = " + result);
    }

    public static void TaskEight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rate A: ");
        double rateA = scanner.nextDouble();

        System.out.print("Enter rate B: ");
        double rateB = scanner.nextDouble();

        System.out.print("Enter constant C: ");
        double constantC = scanner.nextDouble();

        double delta;

        delta = Math.pow(rateB,2) - (4 * rateA * constantC);

        System.out.println("Delta to rateA: " + rateA + ", rateB: " + rateB + " and constant C: " + constantC+ " equal " + delta);
    }
}
