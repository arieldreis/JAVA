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
}
