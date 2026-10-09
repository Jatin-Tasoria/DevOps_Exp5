package com.tasoria.org;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter number of units: ");
            int units = scanner.nextInt();

            if (units < 0) {
                throw new IllegalArgumentException("Units cannot be negative.");
            }

            if (units <= 150) {
                System.out.println("No Bill is Due");
            } else if (units <= 300) {
                System.out.println("Bill is: " + (units * 10));
            } else {
                System.out.println("Bill is: " + (units * 15));
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}