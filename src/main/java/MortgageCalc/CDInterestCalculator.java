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
// CALCULATING THE FUTURE VALUE AND INTEREST EARNED
        double interestRatePerPeriod = interestRate / 36500; //  Assume daily compounding
        int periods = years * 365;
        double futureValue = deposit*Math.pow(1 +interestRatePerPeriod, periods);
        double interestEarned = futureValue - deposit;
// DISPLAY OUTPUT/RESULTS
        System.out.println("Total interest earned: $" + String.format("%.2f", interestEarned));
        System.out.println("your CD's ending balance: $"+ String.format("%.2f", futureValue));
// CLOSE SCANNER
        myScanner.close();
    }
}
