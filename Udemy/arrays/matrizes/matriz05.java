package arrays.matrizes;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class matriz05 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int vetor[][] = new int[3][3];

        vetor[0][0] = 5;
        vetor[0][1] = 12;
        vetor[0][2] = 10;

        vetor[1][0] = 17;
        vetor[1][1] = 19;
        vetor[1][2] = 20;

        vetor[2][0] = 23;
        vetor[2][1] = 26;
        vetor[2][2] = 30;

        int cima = 0;
        int esquerda = 0;
        int direita = 0;
        int abixo = 0;

        int teste = 23;

        for (int linha = 0; linha < vetor.length; linha++) {
            for (int coluna = 0; coluna < vetor[linha].length; coluna++) {
                // Use printf para formatar o espaçamento, se necessário
                System.out.printf("%4d", vetor[linha][coluna]);
            }
            // Quebra de linha após cada linha da matriz
            System.out.println();

        }

        for (int linha = 0; linha < vetor.length; linha++) {
            for (int coluna = 0; coluna < vetor[linha].length; coluna++) {
                if(vetor[linha][coluna] == teste){
                    if (linha > 0) {
                        cima = vetor[linha - 1][coluna];
                    }
                }
            }
        }
        System.out.println(cima);
    }
}
