package com.thoughtworks.baseline;

//calculates the tax for an item
public class TaxCalculator {
    String inputString;
    public TaxCalculator(String inputString) {
        this.inputString = inputString;
    }

    public double basicSalesTax() {
        if(inputString.contains("book") || inputString.contains("pill") || inputString.contains("chocolate"))
            return 0;
        else
            return 10.0;
    }

    public double importTax() {
        if(inputString.contains("imported"))
            return 5.0;
        else
            return 0.0;
    }

    public double salesTax() {
        return 0;
    }
}
