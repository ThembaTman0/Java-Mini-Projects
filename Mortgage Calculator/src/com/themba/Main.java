package com.themba;

import java.util.Scanner;

public class Main {
    static final int PERCENTAGE=100;
    static final int MONTHS=12;
    public static double calculateMortgage(int principle, double annualInterestRate, int period) {
        double r = (annualInterestRate / PERCENTAGE) / MONTHS;
        double x = Math.pow((1 + r), period);

        return (double) principle * ((r * x) / (x - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Loan Period (months): ");
        int period = scanner.nextInt();

        double monthlyPayment = calculateMortgage(principle, annualInterestRate, period);
        System.out.printf("Monthly Mortgage Payment: $%.2f%n", monthlyPayment);
    }
}
