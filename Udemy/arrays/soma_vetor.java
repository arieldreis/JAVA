package arrays;
import java.util.*;

public class soma_vetor {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int repeticao = sc.nextInt();
        double[] numeros = new double[repeticao];

        for(int index = 0; index < repeticao; index++){
            System.out.println("Digite um numero:");
            numeros[index] = sc.nextDouble();
        }
        System.out.println();
        System.out.printf("Valores = %s\n", Arrays.toString(numeros));
        System.out.printf("Soma = %.2f\n", Arrays.stream(numeros).sum());
        OptionalDouble media = Arrays.stream(numeros).average();
        System.out.println("Media = " + media);
        sc.close();
    }
}
