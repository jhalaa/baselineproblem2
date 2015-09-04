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
    public void totalSalesTaxShouldBeZeroIfFoodAndNotImported() {
        TaxCalculator taxCalculator = new TaxCalculator("4 chocolates");
        assertEquals(0.0,taxCalculator.salesTax(),0.01);
    }

    @Test
    public void salesTaxShouldBeCalculatedIfImpoted() {
        TaxCalculator taxCalculator = new TaxCalculator("1 imported chocolates at 10.0");
        assertEquals(10.50,taxCalculator.CostWithSalesTax(),0.01);
    }

    @Test
    public void salesTaxShouldBeCalculatedIfBasicTaxApplies() {
        TaxCalculator taxCalculator = new TaxCalculator("1 CD  at 14.99");
        assertEquals(16.49,taxCalculator.CostWithSalesTax(),0.01);
    }

    @Test
    public void salesTaxShouldBeCalculatedIfBothBasicTaxAndImportTaxApplies() {
        TaxCalculator taxCalculator = new TaxCalculator("1 imported bottle of perfume  at 27.99");
        assertEquals(32.19,taxCalculator.CostWithSalesTax(),0.01);
    }

    @Test
    public void totalTaxCalculated() {
        TaxCalculator taxCalculator = new TaxCalculator("1 imported bottle of perfume  at 27.99");
        assertEquals(4.2,taxCalculator.salesTax(),0.01);
    }

}
