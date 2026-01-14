package arrays.matrizes;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class matriz05 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double A = nota1 * 3.5;
        double B = nota2 * 7.5;

        double avg = (A + B) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f" , avg);
    }
}
