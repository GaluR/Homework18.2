package pl.javastart.demomaven;

import pl.javastart.demomaven.service.TaxService;

public class Application {
    public static void main(String[] args) {
        TaxService tax = new TaxService();
        System.out.println(tax.calculateTaxes(1000));
    }
}
