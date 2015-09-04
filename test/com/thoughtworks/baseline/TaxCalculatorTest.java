package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TaxCalculatorTest {

    @Test
    public void basicSalesTaxIsTenPercent() {
        TaxCalculator taxCalculator = new TaxCalculator("xyz");
        assertEquals(10.0,taxCalculator.basicSalesTax(),0.01);
    }

    @Test
    public void basicSalesTaxZeroForBook() {
        TaxCalculator taxCalculator = new TaxCalculator("book");
        assertEquals(0.0,taxCalculator.basicSalesTax(),0.01);
    }

    @Test
    public void basicSalesTaxZeroForMedicines() {
        TaxCalculator taxCalculator = new TaxCalculator("4 pills");
        assertEquals(0.0,taxCalculator.basicSalesTax(),0.01);
    }

    @Test
    public void basicSalesTaxZeroForFood() {
        TaxCalculator taxCalculator = new TaxCalculator("4 chocolates");
        assertEquals(0.0,taxCalculator.basicSalesTax(),0.01);
    }

    @Test
    public void importTaxIsFivePercentForAllImportedItems() {
        TaxCalculator taxCalculator = new TaxCalculator("4 imported chocolates");
        assertEquals(5.0,taxCalculator.importTax(),0.01);
    }

    @Test
    public void importTaxIsZeroPercentForNonImportedItems() {
        TaxCalculator taxCalculator = new TaxCalculator("4 chocolates");
        assertEquals(0.0,taxCalculator.importTax(),0.01);
    }

    @Test
    public void totalSalesTaxShouldBeZeroIfFoodAndNotImpoted() {
        TaxCalculator taxCalculator = new TaxCalculator("4 chocolates");
        assertEquals(0.0,taxCalculator.salesTax(),0.01);
    }

}
