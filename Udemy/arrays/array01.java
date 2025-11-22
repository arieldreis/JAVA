package arrays;
import java.util.Scanner;
import java.util.Locale;
public class array01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de Alturas: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int index = 0; index < n; index++){
            System.out.println("Digite:");
            vect[index] = sc.nextDouble();
        }
        double sum = 0.0;
        for(int index = 0; index < n; index++){
            sum+=vect[index];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f", avg);
        sc.close();
    }
}
