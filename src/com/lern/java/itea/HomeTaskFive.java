package com.lern.java.itea;

import java.util.Scanner;

public class HomeTaskFive {
    public static void main(String[] args) {
        TaskOne(); // приклади масивів
        System.out.println();
        TaskTow(); // сума двох масивів
        System.out.println();
        TaskThree(); // приклади циклів
        System.out.println();
        TaskFor(); // послідовність фібоначі
        System.out.println();
        System.out.println(TaskFive()); //перевірка на кратність
        TaskSix(); //зведення в квадрат + 2
        TaskSeven(); // число в кубі
        TaskEight(); // два числа в степені один одного і сума степенів

    }

    public static void TaskOne() {
        byte[] listByte = {1, 2, 3, 4, 5};
        short[] listShort = {11, 12, 13, 14, 15};
        long[] listLong = {10, 20, 30, 40, 50};
        int[] listInt = {100, 200, 300, 400, 500};
        float[] listFloat = {100,1, 200,2, 300,3, 400,4, 500,5};
        double[] listDouble = {100.1, 200.2, 300.3, 400.4, 500.5};
        char[] listChar = {'A', 'B', 'C', 'D', 'F'};
        boolean[] listBoolean = {false, false, true, true, true};
        String[] listString = {"A", "B", "C", "D", "F"};


        for (int i = 0; i < listByte.length; i++) {
            System.out.println();
            System.out.print(listByte[i] + ", ");
            System.out.print(listShort[i] + ", ");
            System.out.print(listLong[i] + ", ");
            System.out.print(listInt[i] + ", ");
            System.out.print(listFloat[i] + ", ");
            System.out.print(listDouble[i] + ", ");
            System.out.print(listChar[i] + ", ");
            System.out.print(listBoolean[i] + ", ");
            System.out.print(listString[i] + ", ");
        }
    }

    public static void TaskTow() {
        Scanner scanner = new Scanner(System.in);
        int[] listForNumbers = new int[5];
        int[] listFiveNumbers = new int[5];
        int[] sumTowList = new int[listFiveNumbers.length];

        System.out.println("Enter 4 numbers in list: ");

        for (int i = 0; i < listForNumbers.length - 1; i++) {
            listForNumbers[i] = scanner.nextInt();
        }

        System.out.println("Ok.");
        System.out.println("Enter next 5 numbers in another list: ");

        for (int i = 0; i < listFiveNumbers.length; i++) {
            listFiveNumbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Ok. Sum tow list:");

        for (int i = 0; i < sumTowList.length; i++) {
            sumTowList[i] = listForNumbers[i] + listFiveNumbers[i];
            if (i < sumTowList.length - 1) {
                System.out.print(sumTowList[i] + ", ");
            } else {
                System.out.println(sumTowList[i] + ".");
            }
        }
    }

    public static void TaskThree() {
        int count = 0;
        int arithmetic = 1;
        int geometric = 1;
        int delta = 2;

        System.out.println("Цикли:");
        System.out.println("З передумовою:");
        while (count < 10) {
            if (arithmetic < 12) {
                System.out.print(arithmetic + ", ");
                arithmetic = arithmetic + delta;
            }
            count++;
        }
        System.out.println();
        count = 0;

        while (count < 10) {
            if (geometric < 12) {
                System.out.print(geometric + ", ");
                geometric = geometric * delta;
            }
            count++;
        }
        System.out.println();
        arithmetic = 1;
        geometric = 1;
        System.out.println("З параметром: ");

        for (int i = 0; i < 6; i++) {
                System.out.print(arithmetic + ", ");
            arithmetic = arithmetic + delta;
        }

        System.out.println();
        for (int i = 0; i < 4; i++) {
                System.out.print(geometric + ", ");
            geometric = geometric * delta;
        }

        System.out.println();
        count = 0;
        arithmetic = 1;
        geometric = 1;
        System.out.println("З пост умовою: ");

        do {
            System.out.print(arithmetic + ", ");
            arithmetic = arithmetic + delta;
            count++;
        } while (count < 6);

        System.out.println();
        count = 0;

        do {
            System.out.print(geometric + ", ");
            geometric = geometric * delta;
            count++;
        } while (count < 4);
    }

    public static void TaskFor() {
        Scanner scanner =  new Scanner(System.in);
        int numberOne = 0;
        int numberTow = 1;
        int result = 0;

        System.out.print("Задати значення: ");
        int maxValue = scanner.nextInt();

        if (maxValue > 0) {
            while (result < maxValue) {
                System.out.print(result + ", ");
                result = numberOne + numberTow;
                numberOne = numberTow;
                numberTow = result;
            }
        } else {
            System.out.println("Вести значення > 0");
        }
    }

    public static boolean TaskFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вести ціле число для перевірки кратності двом: ");
        int enterNumber = scanner.nextInt();

        return enterNumber % 2 == 0;
    }

    public static void TaskSix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть ціле число: ");
        int enterNumber = scanner.nextInt();
        int resultOne = enterNumber * enterNumber;
        int resultTow = resultOne + 2;

        System.out.println("Ведене число в квадраті = " + resultOne);
        System.out.println("Фінальний результат = " + resultTow);
    }

    public static void TaskSeven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть число для відображення в кубі: ");
        int enterNumber = scanner.nextInt();

        double result = Math.pow(enterNumber, 3);
        System.out.println("Число в кубі = " + result + ".");
    }

    public static void TaskEight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вести число A: ");
        int enterNumberA = scanner.nextInt();
        System.out.print("Вести число B: ");
        int enterNumberB = scanner.nextInt();
        double resultA = enterNumberA;
        double resultB;

        for (int i = 0; i < enterNumberB - 1; i++) {
            resultA *= enterNumberA;
        }

        resultB = Math.pow(enterNumberB, enterNumberA);
        double resultTowNum = resultA + resultB;

        System.out.println("Число: " + enterNumberA + " в степені: " + enterNumberB + " = " + resultA);
        System.out.println("Число: " + enterNumberB + " в степені: " + enterNumberA + " = " + resultB);
        System.out.println("Сума чисел:" + resultA + " та " + resultB + " = " + resultTowNum);
    }
}
