package arrays;

import java.util.Locale;
import java.util.Scanner;

public class array08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor?");
        int quant = sc.nextInt();
        double[] vetor = new double[quant];
        for(int index = 0; index < quant; index++){
            System.out.println("Digite um numero: ");
            vetor[index] = sc.nextDouble();
        }
        double soma = 0.0;
        for(int index = 0; index < quant; index++){
            soma+=vetor[index];
        }
        double media = soma / quant;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        double abaixo_media = 0;
        for(int index = 0; index < quant; index++){
            if(vetor[index] < media){
                System.out.println(vetor[index]);
            }
        }
    }
}
