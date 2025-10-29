package POO;

import POO.entities.employee;
import java.util.Scanner;
import java.util.Locale;
public class company {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        employee dataEmployee = new employee();

        System.out.println("Name: ");
        dataEmployee.name = sc.nextLine();
        System.out.println("Gross salary: ");
        dataEmployee.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        dataEmployee.Tax = sc.nextDouble();

        // Output
        System.out.printf("Employee: %s, %.2f", dataEmployee.name, dataEmployee.NetSalary());
        System.out.println("\nWhich percentage to increase salary? ");
        dataEmployee.porcent = sc.nextDouble();
        dataEmployee.IncreaseSalary(dataEmployee.porcent);
        System.out.printf("Update data: %s, %s", dataEmployee.name, dataEmployee.toString());

    }
}
