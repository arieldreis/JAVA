/*APRENDENDO A USAR FUNÇÃO EM JAVA*/
import java.util.Scanner;
public class ex024 {
    static void numeros(int n){
        if(n % 2 == 0){
            System.out.println("PAR!");
        }else{
            System.out.println("ÍMPAR");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num_user = sc.nextInt();
        numeros(num_user);
    }
}
