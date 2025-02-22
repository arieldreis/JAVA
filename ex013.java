import java.util.Scanner;
public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        int numero = sc.nextInt();
        if(numero == 0){
            System.out.println("VOCÊ DIGITOU O NÚMERO ZERO.");
        }else if(numero < 0){
            System.out.println("VOCÊ DIGITOU UM NÚMERO NEGATIVO.");
        }else{
            System.out.println("VOCÊ DIGITOU UM NÚMERO POSITIVO.");
        }
    }
}