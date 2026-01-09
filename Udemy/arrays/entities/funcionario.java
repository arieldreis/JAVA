package arrays.entities;

import java.util.List;

public class funcionario {
    private Integer id;
    String name;
    private Double salary;

    public funcionario(Integer id, String name, Double salary) {
    }

    public void increaseSalary(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        this.salary += (this.salary * percent);
    }

    public void show(){
        System.out.println(id + ", " + name + ", " + salary);
    }
}
