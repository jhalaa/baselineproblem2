package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TaxCalculatorTest {

    @Test
    public void basicSalesTaxIsTenPercent()
    {
        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals(10.0,taxCalculator.basicSalesTax(),0.01);
    }

}
