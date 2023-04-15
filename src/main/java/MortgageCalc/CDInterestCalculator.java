package MortgageCalc;

import java.util.Scanner;
public class CDInterestCalculator {
    public static void main(String[] args) {
// CREATE SCANNER TO READ INPUT FROM USER
        Scanner myScanner = new Scanner(System.in);
// PROMPT USER INPUT
        System.out.print("Enter the deposit amount: ");
        double deposit = myScanner.nextDouble();

        System.out.print("Enter  the annual interest rate (%): ");
        double interestRate = myScanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = myScanner.nextInt();
// CALCULATING THE FUTURE VALUE AND INTEREST SPEED
        double interestRatePerPeriod = interestRate / 36500; //  Assume daily compounding
        int periods = years * 365;
        double futureValue = deposit*Math.pow(1 +interestRatePerPeriod, periods);
        double interestEarned = futureValue - deposit;
// DISPLAY OUTPUT/RESULTS
        System.out.printf("If you deposit $%.2f in a CD that earns %.2f%% interest and interest and matures in %d years,%n", deposit, interestRate, years);
        System.out.printf("your CD's ending balance will be $%.2f and you would have earned $%2f in interest%n", futureValue, interestEarned);

    }
}
