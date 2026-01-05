package POO.entities;

public class CurrencyConverter {
    public double dollarPrice;
    public double boughtDollar;
    public double reais;

    public double conversao(){
        double tax = (dollarPrice * boughtDollar) * 0.06;
        double moedaInReais = (dollarPrice * boughtDollar) + tax;
        return moedaInReais;
    }
}