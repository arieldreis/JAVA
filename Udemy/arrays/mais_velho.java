package arrays;
import java.util.Locale;
import java.util.Scanner;
public class mais_velho {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar?");
        int qtd = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtd];
        int[] idade = new int[qtd];

        for(int index = 0; index < qtd; index++){
            System.out.printf("Dados da %d° pessoa:\n", index + 1);

            System.out.println("Nome: ");
            nome[index] = sc.nextLine();

            System.out.println("Idade: ");
            idade[index] = sc.nextInt();

            sc.nextLine();
        }
        int maisVelho = 0;
        String Pvelho = "";
        for(int index = 0; index < qtd; index++){
            if(idade[index] > maisVelho){
                maisVelho = idade[index];
                Pvelho = nome[index];
            }
        }
        System.out.printf("PESSOA MAIS VELHA É %s QUE TEM %d ANOS DE IDADE", Pvelho.toUpperCase(), maisVelho);
        sc.close();
    }
}
