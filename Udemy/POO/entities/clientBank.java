package POO.entities;

public class clientBank {
    private int numberAccount;
    private String nameClient;
    private double deposit;

    public clientBank(int numberAccount, String nameClient, double deposit){
        this.numberAccount = numberAccount;
        this.nameClient = nameClient;
        this.deposit = deposit;
    }

    public int getNumberAccount(int integernumberAccount){
        return numberAccount;
    }
    public String getNameClient(String name){
        return name;
    }
    public double getDeposit(){
        return deposit;
    }

    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }
    public void setDeposit(double deposit){this.deposit = deposit;}

    public void deposit(double deposit){
        this.deposit += deposit;
    }
    public void withdraw(double deposit){
        this.deposit -= (deposit + 5);
    }

    @Override
    public String toString() {
        return "Account " + numberAccount
                + ", Holder: " + nameClient
                + ", Balance: " + deposit;
    }
}