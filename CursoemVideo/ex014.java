import java.util.Scanner;
import java.util.Random;
public class ex014{
    public static final String roxo = "\u001B[1;35m";
    public static final String azul = "\u001B[1;34m";
    public static final String escape = "\u001B[1;0m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            Random aleatorio = new Random();
            int computador = aleatorio.nextInt(20) + 1;
            System.out.println(azul + "DIGITE O SEU PALPITE: " + escape);
            int jogador = sc.nextInt();
            if (jogador == computador){
                System.out.println( roxo + "Parabéns! Você acertou!" + escape);
                break;
            }else{
                System.out.println(roxo + "Errado! Tente novamente." + escape);
            }
        }
    }
}