package arrays.exercises;
import java.util.*;

import arrays.entities.funcionario;
import java.util.ArrayList;
public class EmpresaFuncionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario empresa = new funcionario();

        List<Integer> idEmployee = new ArrayList<Integer>();
        List<String> nameEmployee = new ArrayList<String>();
        List<Double> salaryEmployee = new ArrayList<Double>();


        List<Object> dadosGerais = new ArrayList<>();

        int id;
        String name;
        double salary = 0.0;


        System.out.println("How many employees will be registered?");
        int qtd = sc.nextInt();
        sc.nextLine();

        for(int index = 0; index < qtd; index++){
            System.out.printf("Employee #%d\n", index + 1);
            System.out.println("ID: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Salary: ");
            salary = sc.nextDouble();

            sc.nextLine();

            // Adicionando os elementos a lista
            idEmployee.add(id);
            nameEmployee.add(name);
            salaryEmployee.add(salary);

            dadosGerais.add(idEmployee);
            dadosGerais.add(nameEmployee);
            dadosGerais.add(salaryEmployee);

            // Adicionado ás variavéis ao objeto empresa
            empresa.getId(Collections.singletonList(id));
            empresa.getName(Collections.singletonList(name));
            empresa.getSalary(Collections.singletonList(salary));
        }
        System.out.println("----------------------------");
        System.out.println("List of Employee: ");
        for(int index = 0; index < dadosGerais.toArray().length; index++){
            System.out.println("ID: " + dadosGerais.get(index));
            System.out.println("Nome: " + dadosGerais.get(index));
            System.out.println("Salário: " + dadosGerais.get(index));
            break;
        }
        System.out.println("----------------------------");
        empresa.show();
        sc.close();
    }
}
