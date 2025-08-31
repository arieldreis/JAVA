import entities.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;
public class currency {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter moeda = new CurrencyConverter();

        System.out.println("What is the dollar price: ");
        moeda.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        moeda.boughtDollar = sc.nextDouble();


        System.out.printf("Amount to be paid in reais = US$%.2f", moeda.conversao());
    }
}
