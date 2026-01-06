package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int qtd = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtd];
        int[] idade = new int[qtd];
        double[] altura = new double[qtd];

        for(int index = 0; index < qtd; index++){
            System.out.printf("Dados da %d° pessoa:\n", index + 1);

            System.out.print("Nome: ");
            nome[index] = sc.nextLine();

            System.out.print("Idade: ");
            idade[index] = sc.nextInt();

            System.out.print("Altura: ");
            altura[index] = sc.nextDouble();

            sc.nextLine();
        }

        double somaAlturas = 0.0;
        int numero_menores = 0;
        for(int index = 0; index < qtd; index++){
            if(idade[index] < 16){
                numero_menores++;
            }
            somaAlturas += altura[index];
        }

        double mediaAlturas = somaAlturas / qtd;
        double percentualMneores = ((double) numero_menores /  qtd) * 100.0;

        System.out.printf("Altura média: %.2f\n", mediaAlturas);
        System.out.printf("Percentual de menores de 16 naos: %.1f%%\n", percentualMneores);

        for(int index = 0; index < qtd; index++){
            if(idade[index] < 16){
                System.out.printf("Pessoas com menos de 16 anos: %s\n", nome[index]);
            }
        }

        /*Como printar todos os elementos de uma array*/
        System.out.println(Arrays.toString(nome));
        System.out.println(Arrays.toString(idade));
        System.out.println(Arrays.toString(altura));
        sc.close();
    }
}
