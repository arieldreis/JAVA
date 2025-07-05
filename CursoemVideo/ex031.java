// Progressão aritimética no terminal
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Início: ");
        int inicio = sc.nextInt();
        System.out.println("Fim: ");
        int fim = sc.nextInt();
        System.out.println("Passo: ");
        int passo = sc.nextInt();
        for (int cont = inicio; cont <= fim; cont+=passo){
            System.out.println(cont);
        }
    }
}