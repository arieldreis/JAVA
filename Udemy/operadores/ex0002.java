import java.util.Scanner;
import java.util.Locale;
public class ex0002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, type the height of your house: ");
        double height = sc.nextDouble();
        System.out.println("Please, type the width of your house: ");
        double width = sc.nextDouble();
        System.out.println("Metro Quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = height * width;
        double price = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRICE = %.2f%n", price);
        sc.close();
    }
}

