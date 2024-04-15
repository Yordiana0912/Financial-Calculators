package financialcalculators;

import java.util.Scanner;

// request principal, interest rate, loan length from user / also search formula to calculate/
// divide the interest rate by 100 so it get converest into decimal and provide

public class Financialcalculators {
    final int MONTH_IN_YEAR = 12 ;
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount ");
        double principal = scanner.nextDouble();

        System.out.println("Enter annual interest rate ");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the terms in years: ");
        int termsInYears = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / 12 ;
        int numberOfPayments = termsInYears * 12 ;

        double monthlyPayment = principal * (
                (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate , numberOfPayments)) /
                        ((Math.pow( 1 + monthlyInterestRate, numberOfPayments)-1)
                )));
         System.out.println("Monthly payment: " + monthlyPayment);
    }






}
