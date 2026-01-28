package POO.entities;

public class clientBank {
    private int numberAccount;
    private String nameClient;
    private double deposit;

    public void dataClient(int numberAccount, String nameClient, double deposit){
        this.numberAccount = numberAccount;
        this.nameClient = nameClient;
        deposit(deposit);
    }

    public int getNumberAccount(int integernumberAccount){
        return numberAccount;
    }
    public String getNameClient(String name){
        return name;
    }
    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }
    public double getDeposit(){
        return deposit;
    }
    public void setDeposit(double deposit){

        this.deposit = deposit;
    }
    public void deposit(double deposit){
        this.deposit += deposit;
    }
    public void withdraw(double deposit){
        this.deposit -= (deposit + 5);
    }
    public void show(){
        double deposit1 = getDeposit();
        System.out.printf("Account %d, Holder: %s, Balance: %.2f", numberAccount, nameClient, deposit1);
    }

    public String toString() {
        return "Account " + numberAccount
                + ", Holder: " + nameClient
                + ", Balance: " + deposit;
    }
}