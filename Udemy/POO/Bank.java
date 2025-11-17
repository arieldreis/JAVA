package POO;
import java.util.Locale;
import java.util.Scanner;
import POO.entities.clientBank;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        clientBank banco = new clientBank();

        int numeroConta;
        String name;
        double deposit = 0;

        System.out.println("Enter account number: ");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        name = sc.nextLine().strip();

        System.out.println("Is there a initial deposit (y/n)? ");
        String msg = sc.nextLine().toLowerCase();

        if(msg.equals("y")){
            System.out.println("Enter a initial deposit value: ");
            deposit = sc.nextDouble();
            banco.deposit(deposit);
            System.out.println("Updated account data: ");
            banco.show();

            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Enter a deposit value:");
            deposit = sc.nextDouble();
            banco.deposit(deposit);
        }
        if(msg.equals("n")){
            banco.show();
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Enter a deposit value:");
            deposit = sc.nextDouble();
            banco.deposit(deposit);
        }
        /* Métodos para depositar e sacar o dinheiro */


        System.out.println("Update account data: ");
        banco.show();
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        banco.withdraw(deposit);
        System.out.println("Updated account data: ");
        banco.show();

        /* Envia os dados das variavéis para a classe clientBank*/
        banco.getNumberAccount(numeroConta);
        banco.getNameClient(name);
        banco.setDeposit(deposit);

        sc.close();
    }
}