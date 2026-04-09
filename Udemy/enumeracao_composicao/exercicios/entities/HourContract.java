package enumeracao_composicao.exercicios.entities;
import java.time.LocalDate;
import java.util.Date;
public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {this.valuePerHour = valuePerHour;}

    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    // Method
    public Double totalValue(){
        return this.valuePerHour * this.hours;
    }

    public String toString(){
        return date + ", " + valuePerHour + ", " + hours;
    }
}