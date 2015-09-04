package com.thoughtworks.baseline;

import java.util.Scanner;

public class TaxCalculatorApplication {
    String inputString="abc";
    double salesTax;
    double total;
    public void start() {
        System.out.println("press x to end");
        while(!(inputString.equals("x"))) {
            TaxCalculator taxCalculator;
            Scanner scanner = new Scanner(System.in);
            inputString = scanner.nextLine();
            taxCalculator = new TaxCalculator(inputString);
            salesTax += taxCalculator.salesTax();
        }
        System.out.println(salesTax);
        
    }
}
