package com.thoughtworks.baseline;

public class TaxCalculator {
    String inputString;
    public TaxCalculator(String inputString) {
        this.inputString = inputString;
    }

    public double basicSalesTax() {
        if(inputString.contains("book"))
            return 0;
        else
            return 10.0;
    }
}
