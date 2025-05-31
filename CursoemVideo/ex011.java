import java.util.Scanner;
public class ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Essa linha importa o scanner para ser lido pelo usuário
        System.out.println("DIGITE A SUA IDADE: ");
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.println("VOCÊ É MAIOR DE IDADE.");
        }else{
            System.out.println("VOCÊ É MENOR DE IDADE.");
        }
    }
}