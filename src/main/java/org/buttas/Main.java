package org.buttas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programme to add 3 numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum of 2 numbers is : " + (a+b));
    }
}