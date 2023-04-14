package MortgageCalc;

import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
// USER INPUT
        System.out.println("Enter is the principal amount: ");
        double principalRes = myScanner.nextDouble(); // principal scanner

        System.out.println("What is the interest rate? ");
        double interestRes = myScanner.nextDouble();

        System.out.println("What is the length of this loan in years? ");
        int loanLengthRes = myScanner.nextInt();
// DECLARING PREVIOUS VARIABLES
        double principal = principalRes; //
        double interest = interestRes;
        double time = loanLengthRes;
// CALCULATION
        double monthlyPayment = (interest * principal) / (1f - (1f + interest (time*12)));
        double totalInterest = (monthlyPayment * (time*12f)) - principal;

//OUTPUT
        System.out.println("Monthly payment: " + String.format("%.2f",  monthlyPayment));
        System.out.println("Total interest paid: " + String.format("%.2f",  totalInterest));

    }
}
