package com.lern.java.itea;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int tmp = 0;

        if (a > 0 & a >b) {
            tmp += a;
        }
        if (b > 0) {
            tmp +=b;
        }
        if (c > 0) {
            tmp +=c;
            }

            System.out.println(tmp);
        }
    }
