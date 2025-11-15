package POO;
import java.util.Locale;
import java.util.Scanner;
import POO.entities.clientBank;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        clientBank banco = new clientBank();

        int numberaccount;
        String name;
        double deposit = 0;
        
        System.out.println("Enter account number: ");
        numberaccount = sc.nextInt();
        System.out.println("Enter account holder: ");
        name = sc.next().strip();
        System.out.println("Is there a initial deposit (y/n)? ");
        String msg = sc.nextLine().toLowerCase();
        if(msg == "y"){
            System.out.println("Enter a initial deposit value: ");
            deposit = sc.nextDouble();
        }
        if(msg == "n"){
            System.out.println("Ok");
        }

        /* Envia os dados das variavéis para a classe clientBank*/
        banco.setNumberAccount(numberaccount);
        banco.setNameClient(name);
        banco.setDeposit(deposit);

        banco.showDatas();
    }
}
