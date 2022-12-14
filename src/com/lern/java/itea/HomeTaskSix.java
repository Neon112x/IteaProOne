package com.lern.java.itea;

import java.util.Scanner;

public class HomeTaskSix {
    public static void main(String[] args) {
        taskOne();
        taskTow(); // рекурсію ще прощупую, з 5 разу вийшло запустити))
        taskThree(); // три перевантажені методи

    }
    public static void taskOne () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вести суму заборгованості: ");
        double amountOwedUAH = scanner.nextDouble();
        double repaidUAH;
        double balance = 0;


        do {
            System.out.print("Вести суму передплати: ");
            repaidUAH = scanner.nextDouble();
            balance += repaidUAH;
            System.out.println("Внесено передплату: " + balance + " грн.");
            if (balance <= 0) {
                System.out.println("Не вірне значення, внесіть > 0.");
                balance = 0;
            } else if (balance > 0 && amountOwedUAH > balance) {
                amountOwedUAH -= balance;
                System.out.println("Списано " + balance + ", сума заборгованості складає: " + amountOwedUAH + " грн.");
                balance = 0;
            } else {
                balance -= amountOwedUAH;
                System.out.println("Списано " + amountOwedUAH + ", сума заборгованості складає: " + 0 + " грн.");
               amountOwedUAH = 0;
            }
        } while (amountOwedUAH > 0);

        System.out.println("Сума заборгованості складає: " + amountOwedUAH + ", залишок передплати: " + balance + " грн.");
    }

    public static void taskTow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть кількість клієнтів для доставки на сьогодні: ");
        int customers = scanner.nextInt();
        int route = 1;
        if (customers > 0) {
            route = count(customers, route);
        } else {
            System.out.println("Кількість пунктів доставки має бути більше 0.");
        }
    }

    public static int count(int count, int route) {
        route *= count;
        count--;
        while ( count > 0) {
            count(count, route);
            count--;
        }
            System.out.println("route = " + route);
        return route;
    }

    public static void taskThree () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number with fiveNumber: ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter 2 number with fiveNumber: ");
        double n2 = scanner.nextDouble();
        System.out.println("Enter 3 number with fiveNumber: ");
        double n3 = scanner.nextDouble();
        System.out.println("Enter 4 number with fiveNumber: ");
        double n4 = scanner.nextDouble();
        System.out.println("Enter 5 number with fiveNumber: ");
        double n5 = scanner.nextDouble();
        System.out.println("Enter 1 number to (5, 5, 5...) : ");
        double n6 = scanner.nextDouble();
        System.out.println("Enter 2 number to (5, 5, 5...) : ");
        double n7 = scanner.nextDouble();
        System.out.println("Enter 1 number to (5, 5, 5, 5...): ");
        double n8 = scanner.nextDouble();

       double fiveNumber = taskThree(n1,n2,n3,n4,n5);
       double towNumber = taskThree(n6,n7);
       double oneNumber = taskThree(n8);

        System.out.println("Середнє арефметичне з 5 ведених чисел: " + fiveNumber);
        System.out.println("Середнє арефметичне з 2 ведених чисел та 3 перевантажених (5) : " + towNumber);
        System.out.println("Середнє арефметичне з 1 веденого числа та 4 перевантажених (5) : " + oneNumber);

       double maxNumber = Math.max(fiveNumber, Math.max(towNumber, oneNumber));
       double minNumber = Math.min(fiveNumber, Math.min(towNumber,oneNumber));
       double averageNumber;
       if ((maxNumber == fiveNumber && minNumber == towNumber) || (maxNumber == towNumber && minNumber == fiveNumber)) {
           averageNumber = oneNumber;
       } else if ((maxNumber == towNumber && minNumber == oneNumber) || (maxNumber == oneNumber && minNumber == towNumber)) {
           averageNumber = fiveNumber;
       } else {
           averageNumber = towNumber;
       }

        System.out.println("Max number = " + maxNumber);
        System.out.println("Average number = " + averageNumber);
        System.out.println("Min number = " + minNumber);
    }
    public static double taskThree(double numFive) {
       return taskThree(5,5,5,5,numFive);
    }

    public static double taskThree(double numFour, double numFive) {
       return taskThree(5,5,5, numFour, numFive);
    }

    public static double taskThree(double numOne, double numTow, double numThree, double numFour, double numFive) {
        int quantity = 5;
        double averageNum = (numOne + numTow + numThree + numFour + numFive)/quantity;
        return averageNum;
    }
}
