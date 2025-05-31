import java.util.Scanner;
public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DIGITE O SUE NOME: ");
        String nome = sc.nextLine();
        System.out.print("DIGITE A SUA NOTA: ");
        float nota = sc.nextFloat();
        System.out.format("O ALUNO %s TIROU A NOTA %.2f", nome, nota);
    }
}