package POO.entities;

public class clientBank {
    private int numberAccount;
    private String nameClient;
    private double deposit;
    public void dataClient(int numberAccount, String nameClient, double deposit){
        this.numberAccount = numberAccount;
        this.nameClient = nameClient;
        this.deposit = deposit;
    }

    public int getNumberAccount(){
        return numberAccount;
    }
    public void setNumberAccount(int numberAccount){
        this.numberAccount = numberAccount;
    }
    public String getNameClient(){
        return nameClient;
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
    public void addMoney(double deposit){
        this.deposit += deposit;
    }
    public void removeMoney(double deposit){
        this.deposit -= (deposit + 5);
    }
    public void showDatas(){
        System.out.printf("Account %d, Holder: %s, Balance: %.2f", getNumberAccount(), getNameClient(), getDeposit());
    }
}
