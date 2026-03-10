package enumeracao_composicao.exercicios.entities;
import enumeracao_composicao.exercicios.entities.enums.WorkerLevel;
import enumeracao_composicao.exercicios.entities.HourContract;
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

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
    public void addContract(HourContract contract){}
    public void removeContract(HourContract contract){}
    private Double income(Integer year, Integer month){}

}
