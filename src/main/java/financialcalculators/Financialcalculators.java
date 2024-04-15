package financialcalculators;

import java.util.Scanner;

// request principal, interest rate, loan length from user / also search formula to calculate/
// divide the interest rate by 100 so it get converest into decimal and provide

public class Financialcalculators {
    final int MONTH_IN_YEAR = 12 ;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Which Calcuator would you like to use? ");
        System.out.println(" 1. Mortgage Calculator " );
        System.out.println(" 2. CD Calculator"  );
        int calculator = scanner.nextInt();

        if( calculator == 1) {


            System.out.println("Enter principal amount ");
            double principal = scanner.nextDouble();

            System.out.println("Enter annual interest rate ");
            float annualInterestRate = scanner.nextFloat();


            System.out.println("Enter the terms in years: ");
            int termsInYears = scanner.nextInt();

            double convertinterestrate = annualInterestRate / 100;
            double monthlyInterestRate = convertinterestrate / 12;
            int numberOfPayments = termsInYears * 12;

            double monthlyPayment = principal * (
                    (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                            ((Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1)
                            )));
            System.out.println("Monthly payment: " + monthlyPayment);
        } else if (calculator == 2) {

            System.out.println(" How much would you like to deposit into your CD account? ");
            double amountdeposit = scanner.nextInt();

            System.out.println(" Please enter CD rate ? ");
            float cdvalue = scanner.nextFloat();

            System.out.println(" How many years is your CD term ?");
            int cdterms = scanner.nextInt();

            double convertCdrate = cdvalue / 100;

            double futurevalue = amountdeposit *
                    ((Math.pow( 1 + convertCdrate , cdterms )));
            System.out.println("Future Value: "+ futurevalue);
        }

        }

    }


