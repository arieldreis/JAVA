package enumeracao_composicao.exercicios.entities;
import enumeracao_composicao.exercicios.entities.enums.WorkerLevel;
import enumeracao_composicao.exercicios.entities.HourContract;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract>  contracts = new ArrayList<>();

    // Contrutor
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }


    // Method
    public List<HourContract> getHourContracts(){
        return contracts;
    }
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;
        for(HourContract contract : contracts){
            if(year.equals(contract.getDate().getYear()) && month.equals(contract.getDate().getMonthValue())){
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    public String toString(){
        return name + ", " + level + ", " + baseSalary;
    }

}
