package arrays.exercises;
import java.util.*;
import arrays.entities.funcionario;
import java.util.ArrayList;

public class EmpresaFuncionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<funcionario> funcionarios = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int qtd = sc.nextInt();
        sc.nextLine();

        for(int index = 0; index < qtd; index++){
            System.out.printf("Employee #%d\n", index + 1);
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            funcionario employee = new funcionario(id, name, salary);

            sc.nextLine();
            funcionarios.add(employee);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalario = sc.nextInt();
        sc.close();
    }

    public static Integer position(List<funcionario> funcionarios, int id) {
        for (int index = 0; index < funcionarios.size(); index++) {
            if (funcionarios.get(index).getId() == id) {
                return index;
            }
        }
        return null;
    }
}
