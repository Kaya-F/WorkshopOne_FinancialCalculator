package lmao.com;

import java.util.Scanner;
import java.text.DecimalFormat;

public class haha{
    private long loanAmount;
    private int termInYears;
    private float annualRate;
    private double monthlyPayment;

    public haha(long loanAmount, int termInYears, float annualRate) {
        this.loanAmount = loanAmount;
        this.termInYears = termInYears;
        this.annualRate = annualRate;
    }

    private int getNumberOfPayments() {
        return termInYears * 12;
    }

    private float getMonthlyInterestRate() {
        float interestRate = annualRate / 100;
        return interestRate / 12;
    }

    public void calculateMonthlyPayment() {
        long P = loanAmount;
        float r = getMonthlyInterestRate();
        int n = getNumberOfPayments();

        double M = P * (((r * Math.pow(1 + r, n))) / ((Math.pow((1 + r), n)) - 1));
        this.monthlyPayment = M;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return "Monthly payment: $" + df.format(monthlyPayment);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        long loanAmount = scanner.nextLong();

        System.out.println("What is the interest rate? ");
        float annualRate = scanner.nextFloat();

        System.out.println("What is the length of this loan in years? ");
        int termInYears = scanner.nextInt();

        haha calculator = new haha(loanAmount, termInYears, annualRate);
        calculator.calculateMonthlyPayment();
        System.out.println(calculator.toString());

        scanner.close();
    }
}
