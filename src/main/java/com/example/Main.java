package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // UC1: validating firstname
        String firstNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        System.out.print("Enter Firstname: ");
        String firstName = sc.nextLine();
        while (!firstName.matches(firstNameRegex)) {
            System.out.println("Please enter a valid response.");
            System.out.print("Enter Firstname: ");
            firstName = sc.nextLine();
        }

        sc.close();
    }
}