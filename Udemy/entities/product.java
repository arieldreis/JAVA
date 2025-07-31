package entities;

public class product {
    public String name;
    public double price;
    public int Quantity;
    public int add;
    public int remove;
    public double TotalValueStock(){
        double totalValue = price * Quantity;
        return totalValue;
    }
    public void addProduct(int quantity){
        this.Quantity += quantity;
    }
    public void RemoveProduct(int quantity){
        this.Quantity -= quantity;
    }
}
