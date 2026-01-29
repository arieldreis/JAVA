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

    // @Override: É um "selo de garantia".
    // Ele avisa ao Java: "Estou reescrevendo um método que já existe na classe pai".
    // Se você digitar o nome do método errado, o @Override faz o Java te avisar com um erro.
    @Override
    public String toString() {
        return "Account " + numberAccount
                + ", Holder: " + nameClient
                + ", Balance: " + deposit;
    }
}