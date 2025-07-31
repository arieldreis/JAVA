import java.util.Scanner;
import java.util.Locale;
import entities.product;
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
        System.out.printf("Product data: %s, R$%.2f, %d units, Total: R$%.2f\n",
                dataProduct.name, dataProduct.price, dataProduct.Quantity, total);

        System.out.printf("Enter the number of the products to be add in stock:\n");
        System.out.printf("Update data: %s, R$%.2f, %d units, Total: R$%.2f\n",
                dataProduct.name, dataProduct.price, dataProduct.addProduct(), total);

        System.out.printf("Enter the number of the products to be remove from stock:\n");
        System.out.printf("Update data: %s, R$%.2f, %d units, Total: R$%.2f",
                dataProduct.name, dataProduct.price, dataProduct.RemoveProduct(), total);
    }
}
