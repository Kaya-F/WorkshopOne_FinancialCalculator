package MortgageCalc;

import java.util.Scanner;

public class AnnuityPresentValCalculator {
    public static void main(String[] args){
// CREATE SCANNER TO READ INPUT FROM USER
        Scanner myScanner = new Scanner(System.in);
// PROMPT USER INPUT
        System.out.print("Enter the monthly payout amount: ");
        double monthlyPayout = myScanner.nextDouble();

        System.out.print("Enter the expected annual interest rate (%): ");
        double interestRate = myScanner.nextDouble() / 100;

        System.out.print("Enter the number of years of payout: ");
        int years = myScanner.nextInt();
// CALCULATING
        int months = years * 12;
        double monthlyInterestRate = interestRate / 12;
        double presentValue = monthlyPayout * ((1 - Math.pow(1 + monthlyInterestRate, -months)) / monthlyInterestRate);
// DISPLAY OUTPUT/RESULTS
        System.out.printf("To fund an annuity that pays $%.2f monthly for %d years and earns an expected %.2f%% interest, you would need to invest $%.2f today.%n", monthlyPayout, years, interestRate * 100, presentValue);
// CLOSE SCANNER
        myScanner.close();
    }
}
