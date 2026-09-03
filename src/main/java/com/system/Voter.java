package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public String evaluateEligibility() {
        if (age < 18) {
            return "Ineligible: Underage (Must be at least 18 years old).";
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            return "Ineligible: Not an Indian citizen.";
        }
        if (voterId == null || voterId.trim().isEmpty() || !isIdValid) {
            return "Ineligible: Invalid or missing Voter ID.";
        }
        return "Eligible to vote.";
    }

    public void displayDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Voter Name        : " + name);
        System.out.println("Age               : " + age);
        System.out.println("Citizenship       : " + citizenship);
        System.out.println("Voter ID          : " + voterId);
        System.out.println("ID Status         : " + (isIdValid ? "Valid" : "Invalid"));
        System.out.println("Status            : " + evaluateEligibility());
        System.out.println("----------------------------------------");
    }
}
