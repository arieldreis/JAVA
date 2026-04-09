package enumeracao_composicao.exercicios;

// Importando as classes do progrma
import enumeracao_composicao.exercicios.entities.Worker;
import enumeracao_composicao.exercicios.entities.HourContract;
import enumeracao_composicao.exercicios.entities.Department;
import enumeracao_composicao.exercicios.entities.enums.WorkerLevel;

// Importando data, scanner e language
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Level: ");
        String level = sc.nextLine().toUpperCase();

        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();

        System.out.println("How many contracts to this worker? ");
        int qtdContracts = sc.nextInt();
        sc.nextLine();

        // Instanciando as classes para objetos e adicionando os objetos nas listas.
        Department department = new Department(departmentName);
        workerDepartments.add(department);

        Worker employee = new Worker(name, WorkerLevel.valueOf(level), baseSalary);
        workers.add(employee);

        for(int i = 0; i < qtdContracts; i++) {
            System.out.printf("Enter contract #%d data: ", i + 1);

            System.out.println("\nDate (DD/MM/YYYY): ");
            String dataString = sc.nextLine();
            LocalDate data_convertida = LocalDate.parse(dataString, dtf);

            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration (hours): ");
            int  durationHours = sc.nextInt();
            sc.nextLine();

            HourContract hourContractEmployee = new HourContract(data_convertida, valuePerHour, durationHours);
            workerHourContract.add(hourContractEmployee);
        }

        // System.out.println("Dados do departamento: " + workerDepartments);
        // System.out.println("Dados de horas de contrato: " + workerHourContract);
        // System.out.println("Dados do Trabalhador: " + workers);
    }
}
