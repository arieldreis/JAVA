package POO;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import POO.entities.clientBank;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        clientBank bancoObj = new clientBank();

        double deposit = 0;

        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String name = sc.nextLine().strip();

        // clientBank bancoObj1 = new clientBank(numeroConta, name);

        System.out.println("Is there a initial deposit (y/n)? ");
        String msg = sc.nextLine().toLowerCase();

        if(msg.equals("y")){
            System.out.println("Enter a initial deposit value: ");
            deposit = sc.nextDouble();
            bancoObj.deposit(deposit);
            System.out.println("Updated account data: ");
            bancoObj.show();

            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Enter a deposit value:");
            deposit = sc.nextDouble();
            bancoObj.deposit(deposit);
        }
        if(msg.equals("n")){
            bancoObj.show();
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Enter a deposit value:");
            deposit = sc.nextDouble();
            bancoObj.deposit(deposit);
        }
        /* Métodos para depositar e sacar o dinheiro */

        System.out.println("Update account data: ");
        bancoObj.show();
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        bancoObj.withdraw(deposit);
        System.out.println("Updated account data: ");
        bancoObj.toString();

        /* Envia os dados das variavéis para a classe clientBank*/
        bancoObj.setDeposit(deposit);
        sc.close();
    }
}