package arrays.entities;

import java.util.List;

public class funcionario {
    private int id;
    private String name;
    private double salary;

    public void increaseSalary(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(List<Integer> idEmployee){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(List<String> nameEmployee){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary(List<Double> salaryEmployee){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        this.salary += (this.salary * percent);
    }

    public void show(){
        System.out.println(id + ", " + name + ", " + salary);
    }
}
