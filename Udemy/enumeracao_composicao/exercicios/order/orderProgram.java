package enumeracao_composicao.exercicios.order;
// Importando as classes
import enumeracao_composicao.exercicios.order.entities.client;
import enumeracao_composicao.exercicios.order.entities.order;
import enumeracao_composicao.exercicios.order.entities.orderItem;
import enumeracao_composicao.exercicios.order.entities.orderStatus;
import enumeracao_composicao.exercicios.order.entities.product;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class orderProgram {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Birthdate: (DD/MM/YYYY)");
        String birthdate = sc.nextLine();
        LocalDate birthday_formatter =  LocalDate.parse(birthdate, dtf);

        System.out.println("Enter order data: ");
        String order_status = sc.nextLine().toUpperCase();
        orderStatus os = orderStatus.valueOf(order_status);

        // Pegar a hora atual do sistema com o LocalDateTime
        LocalDateTime now_time = LocalDateTime.now();
        LocalDateTime order_time_formatter = LocalDateTime.parse(order_status, dtf2);

        // Instanciando o objeto do cliente
        client client = new client(name, email, birthday_formatter);
        order pedido = new order(order_time_formatter, os);

        System.out.println("How many items to this order? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Order #%d: ", i + 1);

            System.out.println("Product name: ");
            String product_name = sc.nextLine();

            System.out.println("Product price: ");
            double product_price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            sc.nextLine();
        }

    }
}
