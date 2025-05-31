import java.util.Scanner;
public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO, PARA MOSTRAR A TABUADA: ");
        int tabuada = sc.nextInt();
        int contador = 1;
        while(contador <= 10){
            int mult = tabuada * contador;
            System.out.format("%d x %d = %d\n", tabuada, contador, mult);
            contador+=1;
        }
    }
}