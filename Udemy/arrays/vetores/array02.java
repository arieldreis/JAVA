package arrays.vetores;
import java.util.Locale;
import java.util.Scanner;

public class array02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de Produtos: ");
        int n = sc.nextInt();
        double[] price = new double[n];
        for(int index = 0; index < n; index++){
            System.out.println("Product: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            price[index] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int index = 0; index < n; index++) {
            sum+=price[index];
        }
        double avg = sum / n;
        System.out.printf("Average price = %.2f", avg);
        sc.close();
    }
}
// Usar POO