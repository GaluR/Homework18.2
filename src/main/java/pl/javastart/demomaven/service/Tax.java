package pl.javastart.demomaven.service;

public class Tax {
    private static final int TAX = 85528;
    public double taxes(double a){
        double result=0;
        if(a<=TAX){
            result = a * 0.18 - 556.02;
        }else{
            result = ((a-TAX) * 0.32) + 14839.02;
        }

        return (int)result;
    }
}
