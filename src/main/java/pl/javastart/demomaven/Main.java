package pl.javastart.demomaven;

import pl.javastart.demomaven.service.Tax;

public class Main {
    public static void main(String[] args) {
        Tax tax = new Tax();
        System.out.println(tax.taxes(85528));
    }
}
