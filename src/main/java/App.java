import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    public static void main(String[] args) {
        double euroAmount;
        double rate;
        double dollarAmount;
        Scanner reader = new Scanner(System.in);
        try {
            // Input
            System.out.print("How many euros are you exchanging? ");
            euroAmount = Double.parseDouble(reader.nextLine());
            System.out.print("What is the exchange rate? ");
            rate = Double.parseDouble(reader.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input! Please restart the program and try again.");
            return;
        }
        // Processing
        // c_to / c_from = rate
        // c_to = rate * c_from
        dollarAmount = rate * euroAmount;
        // Output
        System.out.printf("%.0f euros at an exchange rate of %f is \n", euroAmount, rate);
        System.out.printf("%.2f U.S. dollars.", dollarAmount);
    }
}
