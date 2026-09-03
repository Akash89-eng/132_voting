package com.voting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of voters to evaluate: ");
        int numberOfVoters = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfVoters; i++) {
            System.out.println("\nEnter details for Voter #" + (i + 1) + ":");
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Enter Citizenship (e.g., Indian): ");
            String citizenship = scanner.nextLine();
            
            System.out.print("Enter Voter ID: ");
            String voterId = scanner.nextLine();
            
            System.out.print("Is Voter ID valid? (true/false): ");
            boolean isIdValid = scanner.nextBoolean();
            scanner.nextLine(); 

            Voter voter = new Voter(name, age, citizenship, voterId, isIdValid);
            voter.displayDetails();
        }
        scanner.close();
    }
}
