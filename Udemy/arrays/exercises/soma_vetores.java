package arrays.exercises;
import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor?");
        int quant = sc.nextInt();
        int[] vetor1 = new int[quant];
        int[] vetor2 = new int[quant];
        int[] vetor3 = new int[quant];
        System.out.println("Digite os valores do vetor A: ");
        for (int index = 0; index < quant; index++) {
            vetor1[index] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int index = 0; index < quant; index++) {
            vetor2[index] = sc.nextInt();
        }
        for (int index = 0; index < quant; index++) {
            vetor3[index] = vetor1[index] + vetor2[index];
        }
        System.out.println("VETOR RESULTANTE: ");
        for(int index = 0; index < quant; index++){
            System.out.printf("%d\n", vetor3[index]);
        }
        sc.close();
    }
}
