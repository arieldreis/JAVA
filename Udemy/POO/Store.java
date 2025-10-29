package POO;

import java.util.Scanner;
import java.util.Locale;
import POO.entities.product;
public class Store {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        product dataProduct;

        dataProduct = new product();

        System.out.println("Name: ");
        dataProduct.name = sc.nextLine();
        System.out.println("Price: ");
        dataProduct.price = sc.nextDouble();
        System.out.println("Quantity in Stock: ");
        dataProduct.Quantity = sc.nextInt();
        double total = dataProduct.TotalValueStock();
        // Output
        System.out.println("Product data: " +  dataProduct.toString());

        System.out.println("Enter the number of the products to be add in stock: ");
        int quantity = sc.nextInt();
        dataProduct.addProduct(quantity);
        System.out.println("Updated data: " +  dataProduct.toString());

        System.out.println("Enter the number of the products to be remove from stock: ");
        quantity = sc.nextInt();
        dataProduct.RemoveProduct(quantity);
        System.out.println("Updated data: " +  dataProduct.toString());

        sc.close();
    }
}
