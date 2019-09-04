package pl.javastart.demomaven.service;

public class TaxService {
    private static final int TAX_THRESHOLD = 85528;
    private static final int TAX_FREE = 3091;
    public double calculateTaxes(double a){
        double result=0;
        if(a>TAX_FREE && a<=TAX_THRESHOLD){
            result = a * 0.18 - 556.02;
        }else if(a<=TAX_FREE) {
            result = 0;
        }else{
            result = ((a-TAX_THRESHOLD) * 0.32) + 14839.02;
        }

        return Math.round(result);
    }
}
