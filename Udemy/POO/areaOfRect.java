package POO;

import POO.entities.rect;
import java.util.Scanner;
import java.util.Locale;
public class areaOfRect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height");
        rect Retangulo = new rect();
        Retangulo.width = sc.nextDouble();
        Retangulo.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", Retangulo.area());
        System.out.printf("PERIMETER = %.2f\n", Retangulo.Perimeter());
        System.out.printf("DIAGONAL = %.2f", Retangulo.diagonal());
    }
}
