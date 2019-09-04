package pl.javastart.demomaven.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTest {
    TaxService tax = new TaxService();

    @Test
    void taxes() {
        double valueOfTax = 85528;
        int expectedResult = 14839;

        double result = tax.calculateTaxes(valueOfTax);

        assertEquals(expectedResult, result);
    }

    @Test
    void taxes2() {
        double valueOfTax = 95000;
        int expectedResult = 17870;

        double result = tax.calculateTaxes(valueOfTax);

        assertEquals(expectedResult, result);
    }
    @Test
    void taxes3() {
        double valueOfTax = 60000;
        int expectedResult = 10244;

        double result = tax.calculateTaxes(valueOfTax);

        assertEquals(expectedResult, result);
    }
}