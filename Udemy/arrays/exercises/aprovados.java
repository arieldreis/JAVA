package arrays.exercises;
import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int qtd = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtd];
        double[] nota1 = new double[qtd];
        double[] nota2 = new double[qtd];

        double[] todasnotas = new double[qtd];

        for (int index = 0; index < qtd; index++) {
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: ", index + 1);
            nome[index] = sc.nextLine();
            nota1[index] = sc.nextDouble();
            nota2[index] = sc.nextDouble();

            sc.nextLine();
        }
        for(int index = 0; index < qtd; index++){
            todasnotas[index] = nota1[index] + nota2[index] / 2;

        }
        System.out.println("Alunos Aprovados: ");
        for (int index = 0; index < qtd; index++) {
            if(todasnotas[index] >= 6){
                System.out.println(nome[index]);
            }
        }
        sc.close();
    }
}
