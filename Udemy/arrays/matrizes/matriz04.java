package arrays.matrizes;
import java.util.Locale;
import java.util.Scanner;

public class matriz04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ordem da matriz: ");
        int qtd = sc.nextInt();
        double soma = 0.0;

        double matriz[][] = new double[qtd][qtd];
        for (int index = 0; index < matriz.length; index++) {
            for(int j = 0; j < matriz[index].length; j++){
                matriz[index][j] = sc.nextDouble();
            }
        }

        for(int index = 0; index < matriz.length; index++){
            soma += matriz[index][index];
        }

        System.out.println("Soma da diagonal principal: " + soma);
        sc.close();
    }
}
