package MortgageCalc;

import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
// CREATE SCANNER TO READ INPUT FROM USER
        Scanner myScanner = new Scanner(System.in);
// PROMPT USER INPUT
        System.out.println("Enter is the principal amount: ");
        double principal = myScanner.nextDouble();

        System.out.println("What is the interest rate? ");
        double annualInterestRate = myScanner.nextDouble(); // annual to monthly
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        System.out.println("What is the length of this loan in years? ");
        int loanLengthInYears = myScanner.nextInt(); // years to months
        int loanLengthInMonths = loanLengthInYears * 12;
// CALCULATION
        double monthlyPayment = (monthlyInterestRate * principal) /
                (1.0 - Math.pow(1.0 + monthlyInterestRate, -loanLengthInMonths));
        double totalInterest = (monthlyPayment * loanLengthInMonths) - principal;
// OUTPUT
        System.out.println("Monthly payment: $" + String.format("%.2f", monthlyPayment));
        System.out.println("Total interest paid: $" + String.format("%.2f", totalInterest));

    }
}
