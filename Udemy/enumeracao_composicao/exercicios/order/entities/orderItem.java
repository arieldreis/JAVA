package enumeracao_composicao.exercicios.order.entities;

public class orderItem {
    private Integer quantity;
    private Double price;
    private product product;

    public orderItem(Integer quantity, double price, product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    // Getters and Setters
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public product getProduct() {
        return product;
    }
    public void setProduct(product product) {
        this.product = product;
    }

    // Method to subTotal()
    public double subTotal(){
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
