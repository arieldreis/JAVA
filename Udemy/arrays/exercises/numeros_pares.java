package arrays.exercises;
import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int QuantPar = 0;
        for(int index = 0; index < n; index++){
            System.out.println("Digite um numero:");
            numeros[index] = sc.nextInt();
        }
        System.out.println("Números Pares: ");
        for(int index = 0; index < n; index++){
            if(numeros[index] % 2 == 0){
                System.out.print(numeros[index] + " ");
                QuantPar++;
            }
        }
        System.out.println("\nQuantidade de Números Pares: " + QuantPar);
        sc.close();
    }
}
