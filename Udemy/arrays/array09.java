package arrays;
import java.util.Scanner;
import java.util.Locale;

public class array09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int quant = sc.nextInt();
        int[] vetor = new int[quant];
        for(int index = 0; index < quant; index++){
            System.out.println("Digite um numero: ");
            vetor[index] = sc.nextInt();
        }
        int soma = 0;
        int npares = 0;
        for(int index = 0; index < quant; index++){
            if(vetor[index] % 2 == 0 ){
                soma+=vetor[index];
                npares++;
            }
        }
        if(npares == 0){
            System.out.println("NENHUM NUMERO PAR \n");
        }else{
            double mediapares = (double) soma / npares;
            System.out.printf("MEDIA DOS PARES = %f", mediapares);
        }
        sc.close();
    }
}
