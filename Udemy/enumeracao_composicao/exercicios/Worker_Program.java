package enumeracao_composicao.exercicios;

// Importando as classes do progrma
import enumeracao_composicao.exercicios.entities.Worker;
import enumeracao_composicao.exercicios.entities.HourContract;
import enumeracao_composicao.exercicios.entities.Department;
import enumeracao_composicao.exercicios.entities.enums.WorkerLevel;

// Importando data, scanner e language
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Worker_Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Department> workerDepartments = new ArrayList<>();
        List<HourContract> workerHourContract = new ArrayList<>();
        List<Worker> workers = new ArrayList<>();

        Department department = new Department("Engenheiro");
        HourContract hourContractEmployee = new HourContract("2025-04-08", 50.00, 20);
        Worker employee = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.00);

        System.out.println("Dados do departamento: " + department);
        System.out.println("Dados de horas de contrato: " + hourContractEmployee);
        System.out.println("Dados do Trabalhador: " + employee);

    }
}
