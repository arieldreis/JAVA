package arrays;
import java.util.Locale;
import java.util.Scanner;
public class dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] altura = new double[n]; // O valor n que está dentro da array representa o tamanho dela.
        char[] sexo = new char[n];

        double maiorAltura = 0.0;
        double menorAltura = 0.0;
        for (int index = 0; index < n; index++) {
            System.out.printf("Altura %d° pessoa: ", index + 1);
            altura[index] = sc.nextDouble(); // Pegue o número que o usuário digitou e guarde na posição index da array.
            System.out.printf("Genero %d° pessoa: ", index + 1);
            sexo[index] = sc.next().charAt(0);
            sc.nextLine();

            if(altura[index] > maiorAltura){
                maiorAltura = altura[index];
            }
            if(altura[index] < menorAltura){
                menorAltura = altura[index];
            }
        }
        int totH = 0;
        int totM = 0;
        double somaMulheres = 0.0;

        for(int index= 0; index < n; index++){
            if(sexo[index] == 'M'){
                totH++;
            }else{
                somaMulheres += altura[index];
                totM++;
            }
        }
        double media = somaMulheres / totM;
        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);
        System.out.printf("\nMédia das alturas das mulheres = %.2f", media);
        System.out.printf("\nNúmeros de homens = %d", totH);
        sc.close();
    }
}
