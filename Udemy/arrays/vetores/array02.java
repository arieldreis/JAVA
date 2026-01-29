package arrays.vetores;
import java.util.Locale;
import java.util.Scanner;
import arrays.vetores.entities.product_avg;

public class array02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de Produtos: ");
        int n = sc.nextInt();
        product_avg[] listasProDOS = new product_avg[n];
        String name = "";
        double price = 0.0;
        sc.nextLine();

        for(int index = 0; index < n; index++){
            System.out.println("Product: ");
            name = sc.nextLine();

            System.out.println("Price: ");
            price = sc.nextDouble();

            sc.nextLine();

            listasProDOS[index] = new product_avg(name, price);
        }
        double sum = 0.0;
        for (int index = 0; index < n; index++) {
            sum += listasProDOS[index].getPrice();
        }
        double avg = sum / n;
        System.out.printf("Average price = %.2f", avg);
        sc.close();
    }
}
