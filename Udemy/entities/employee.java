package entities;

public class employee {
    public String name;
    public double GrossSalary;
    public double Tax;
    public double porcent;
    public double increase;
    public double liquidSalary;
    public double NetSalary(){ // Liquid Salary
        liquidSalary = GrossSalary - Tax;
        return liquidSalary;
    }
    public void IncreaseSalary(double percentege){ // Increase Salary
        this.increase = (GrossSalary + (GrossSalary * (porcent / 100))) - Tax;
    }
    public String toString(){
        return "Update data: " + name + ", R$" + increase;
    }
}
