import java.util.Scanner;
import java.util.Locale;
public class ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        int soma = 0;
        do{
            System.out.println("Type a number: ");
            number = sc.nextInt();
            soma+=number;
        }while(number != 0);
        System.out.printf("The sum of numbers is: %d", soma);
    }
}

