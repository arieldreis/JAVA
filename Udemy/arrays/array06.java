package arrays;
import javax.swing.text.html.Option;
import java.util.*;

public class array06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int numero = sc.nextInt();
        int[] vetor = new int[numero];
        for(int index = 0; index < numero; index++){
            System.out.println("Digite um numero: ");
            vetor[index] = sc.nextInt();
        }
        int maior = vetor[0];
        int posmaior = 0;
        for(int index = 0; index < numero; index++){
            if(vetor[index] > maior){
                maior = vetor[index];
                posmaior = index;
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Posição = " + posmaior);
    }
}
