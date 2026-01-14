package arrays.matrizes;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class matriz02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de linhas: ");
        int linha = sc.nextInt();
        System.out.println("Número de colunas: ");
        int coluna = sc.nextInt();
        int matrizes[][] = new int[linha][coluna];
        for(int index = 0; index < matrizes.length; index++){ // Linha
            for (int j = 0; j < matrizes[index].length; j++) { // Coluna
                matrizes[index][j] = sc.nextInt();
            }
        }
        System.out.println("Qual número você deseja ás informações na matriz: ");
        int Elementomatrix = sc.nextInt();
        for(int index = 0; index < matrizes.length; index++){
            for (int j = 0; j < matrizes[index].length; j++) {
                if(matrizes[index][j] == Elementomatrix){
                    System.out.println("Position: " + index + ", " + j);
                }
            }
        }

        sc.close();
    }
}
/*;
            System.out.println("Right: ");
            System.out.println("Left: ");
            System.out.println("Up: ");
            System.out.println("Down: ");*/