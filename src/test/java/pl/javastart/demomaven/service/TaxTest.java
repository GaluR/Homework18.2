package pl.javastart.demomaven.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTest {
    Tax tax = new Tax();

    @Test
    void taxes() {
        double valueOfTax = 85528;
        int expectedResult = 14839;

        double result = tax.taxes(valueOfTax);

        assertEquals(expectedResult, result);
    }

    @Test
    void taxes2() {
        double valueOfTax = 95000;
        int expectedResult = 17870;

        double result = tax.taxes(valueOfTax);

        assertEquals(expectedResult, result);
    }
    @Test
    void taxes3() {
        double valueOfTax = 60000;
        int expectedResult = 10243;

        double result = tax.taxes(valueOfTax);

        assertEquals(expectedResult, result);
    }
}