package com.codewithadiga;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalculator
{
    public static void main(String[] args)
    {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years = 1;
        int numberofPayments = years * MONTHS_IN_YEAR;

        double loan = principal
                *(monthlyInterest*Math.pow(1+monthlyInterest, numberofPayments))
                /(Math.pow(1+monthlyInterest, numberofPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(loan);
        System.out.println("Loan: "+mortgageFormatted);
    }


}
