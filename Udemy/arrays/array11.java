package arrays;

import java.util.Locale;
import java.util.Scanner;
import arrays.entities.arrayalturas;

public class array11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        arrayalturas dados_alturas = new arrayalturas();

        System.out.println("Quantas pessoas serao digitadas?");
        int qtd = sc.nextInt();

        String[] nome = new String[qtd];
        int[] idade = new int[qtd];
        double[] altura = new double[qtd];

        for(int index = 0; index < qtd; index++){
            System.out.printf("Dados da %d° pessoa: ", index + 1);
            System.out.println("Nome: ");
            dados_alturas.getNome()
            System.out.println("Idade");
            System.out.println("Altura: ");

        }

    }
}
