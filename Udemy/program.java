import java.util.Scanner;
import java.util.Locale;
import entities.triangle;
public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        triangle x,y;
        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures of the triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of the triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Area Value
        double p = (x.a + x.b + x.c) / 2.0;
        double AreaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double AreaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area is: %f\n", AreaX);
        System.out.printf("Triangle X area is: %f\n", AreaY);
        if(AreaX > AreaY){
            System.out.println("The largest area is X");
        }else{
            System.out.println("The largest area is Y");
        }
    }
}
