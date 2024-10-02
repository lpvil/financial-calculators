package com.pluralsight;

import java.util.Scanner;
//calculate how much monthly payments for loan
//how much interest paid on life of loan
//takes input of principal, interest rate, loan length
//display total monthly payment and total interest paid
public class MortgageCalc{
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int loanlength= loanLength();
        double loanamount=loanAmount();
       double rate=interestRate();

        int totalpayments= loanlength*12;
        double monthlypayment= loanamount * Math.pow((1+rate),(loanlength))/((1+rate),(loanlength -1);
        double monthlyIntR=loanamount*((Math.pow((1+rate/100), (loanlength*12) - loanamount)));

        monthly(monthlyIntR, monthlypayment, totalpayments);


    }
    public static int loanLength(){
        System.out.println("how long would you need loan for?: ");
        int loanL= scanner.nextInt();
        scanner.nextLine();
        return loanL;
    }
    public static double loanAmount(){
        System.out.println("how much would you like to borrow?: ");
        double loan= scanner.nextDouble();
        return loan;
    }

    public static double interestRate(){
        System.out.println("what interest rate are you looking for?: ");
        double intR= scanner.nextDouble();
        return intR;
    }
    public static void monthly(Double monthlyIntR, Double monthlypayment, Integer totalpayments){
        System.out.println("your monthly compound interest: " +monthlyIntR);
        System.out.println("your monthly payment: " +monthlypayment);
        System.out.println("your total payments when paid off: " +totalpayments);
    }
}
