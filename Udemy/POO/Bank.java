package POO;
import java.util.Locale;
import java.util.Scanner;
import POO.entities.clientBank;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        clientBank banco = new clientBank();

        System.out.println("Enter account number: ");
        int numberaccount = sc.nextInt();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there a initial deposit (y/n)? ");
        String msg = sc.nextLine();

        System.out.println();
    }
}
