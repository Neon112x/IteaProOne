package com.lern.java.itea.HomeTaskEight;

import java.util.Scanner;

public class Main extends Car {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTow = new Car("Mazda", "CX-9", 2022,230 );
        Fruits fruitsThree = new Fruits();
        Fruits fruitsFor = new Fruits();
        Fruits fruitsFive = new Fruits();


        carOne.mark = "Mazda";
        carOne.model = "MX - 5";
        carOne.year = 2022;
        carOne.power = 184;

        System.out.println("Mark = " + carOne.mark + ", Model = " + carOne.model + ", Year =  " + carOne.year + ", Power = " + carOne.power + " h.p.");
        System.out.println("Mark = " + carTow.mark + ", Model = " + carTow.model + ", Year =  " + carTow.year + ", Power = " + carTow.power + " h.p.");

        carTow.model = "CX - 9";

        System.out.println("Mark = " + carTow.mark + ", Model = " + carTow.model + ", Year =  " + carTow.year + ", Power = " + carTow.power + " h.p.");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fruit name: ");
        fruitsThree.name = scanner.nextLine();

        System.out.println("Enter fruit weight (in grams): ");
        fruitsThree.weight = scanner.nextDouble();

        fruitsFor.name = "pear";
        fruitsFor.weight = 200;

        fruitsFive.name = "banana";
        fruitsFive.weight = 250;

        System.out.println("Fruit name: " + fruitsThree.name + ", weight = " + fruitsThree.weight + " g.");
        System.out.println("Fruit name: " + fruitsFor.name + ", weight = " + fruitsFor.weight + " g.");
        System.out.println("Fruit name: " + fruitsFive.name + ", weight = " + fruitsFive.weight + " g.");
    }

    public static class Fruits {
        String name;
        double weight;

    }
}
