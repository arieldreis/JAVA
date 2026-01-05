package arrays;
import java.util.Locale;
import java.util.Scanner;
public class array10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String nome;
        double[] vetor = new double[n]; // O valor n que está dentro da array representa o tamanho dela.
        String[] vetorSexo = new String[nome];
        for (int index = 1; index < n; index++) {
            System.out.printf("Altura %d° pessoa: ", index);
            vetor[index] = sc.nextDouble(); // Pegue o número que o usuário digitou e guarde na posição index da array.
            System.out.printf("Genero %d° pessoa: ", index);
        }
        sc.close();
    }
}
