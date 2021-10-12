package com.softwareinstitute.training.orr.kyle;

public class Main {

    public static void main(String[] args) {
        // Code Example from Lecture- Day 2

        // If-Else statements
    int choice = 1;
    String message = "Happy Birthday";
        if (choice == 2){
            System.out.println("This was true");
        }
        else {
            message = "It's not your Birthday";
        }
        System.out.println(message);

        // Ternary Operator instead of if/else
        message = (choice == 1) ? "Happy Christmas" : "You have been bad"; // ? = ternary operator
        System.out.println(message);

        // Switch statement (Changed to enhanced switch by Intellij)
        message = switch (choice) {
            case 0 -> "Xfiles is great";
            case 1 -> "Always Sunny is overrated";
            case 2 -> "Ted Lasso is not funny";
            default -> "Gotham is boring";
        };       // Semi-colon conveys that the switch statement in the curly braces is finished
        System.out.println(message);
    }
}
