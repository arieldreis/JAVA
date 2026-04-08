package enumeracao_composicao.exercicios.entities;
import enumeracao_composicao.exercicios.entities.enums.WorkerLevel;
import enumeracao_composicao.exercicios.entities.HourContract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Contrutor
    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
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
    public void addContract(HourContract contract){

    }
    public void removeContract(HourContract contract){}
    private LocalDate income(Integer year, Integer month){
        String date = year + "/" + month;
        // Formato que o programa será executado.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM");
        return LocalDate.parse(date, dtf);
    }

}
