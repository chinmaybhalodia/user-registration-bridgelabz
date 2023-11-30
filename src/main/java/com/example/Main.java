package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // UC1: validating firstname
        String firstNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        while (!firstName.matches(firstNameRegex)) {
            System.out.println("Please enter a valid response.");
            System.out.print("Enter first name: ");
            firstName = sc.nextLine();
        }

        // UC2: validating lastname
        String lastNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        System.out.print("\nEnter last name: ");
        String lastName = sc.nextLine();
        while (!lastName.matches(lastNameRegex)) {
            System.out.println("Please enter a valid response.");
            System.out.print("Enter last name: ");
            lastName = sc.nextLine();
        }

        // UC3: validating email address
        String emailRegex = "^[a-zA-Z0-9.$&%_+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+$";
        System.out.print("\nEnter email: ");
        String email = sc.nextLine();
        while (!email.matches(emailRegex)) {
            System.out.println("Please enter a valid response.");
            System.out.print("\nEnter email: ");
            email = sc.nextLine();
        }

        sc.close();
    }
}