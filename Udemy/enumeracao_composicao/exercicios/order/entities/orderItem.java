package enumeracao_composicao.exercicios.order.entities;

public class orderItem {
    private Integer quantity;
    private Double price;

    public orderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    // Method to subTotal()
    public Double subTotal(){
        return this.price * this.quantity;
    }
}
