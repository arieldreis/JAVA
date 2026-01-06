package arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;


public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        int negativo = 0;
        for(int index = 0; index < n; index++){
            System.out.println("Digite um número: ");
            numbers[index] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(numbers)); // This line code will display the elements inside of array.
        System.out.println("Negative Numbers: ");
        for(double number : numbers){
            if(number < 0){
                System.out.println(number);
            }else if(number > 0){
                System.out.println("There isn't any negative number.");
            }
        }

        sc.close();
    }
}
