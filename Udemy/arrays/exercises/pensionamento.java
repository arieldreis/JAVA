package arrays.exercises;
import java.util.Locale;
import java.util.Scanner;
import arrays.entities.rent;

public class pensionamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rent[] vect = new rent[10]; // Tamnho fixo do vetro
        System.out.println("How many rooms will be rented? ");
        int qtd = sc.nextInt();
        sc.nextLine();


        for(int index = 0; index < qtd; index++){
            System.out.printf("Rent # %d:\n", index + 1);
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int rooms = sc.nextInt();

            vect[rooms] = new rent(name, email); // Instacia a classe e adiciona os dados.
            sc.nextLine();
        }
        System.out.println("Busy rooms: ");
        for (int index = 0; index < 10; index++) {
            if(vect[index] != null){
                System.out.println(index + ": " + vect[index]);
            }
        }


        sc.close();
    }
}
