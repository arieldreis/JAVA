package enumeracao_composicao.exercicios.order.entities;
import enumeracao_composicao.exercicios.order.entities.orderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class order {
    private LocalDateTime moment;
    private orderStatus status;

    public order(LocalDateTime moment, orderStatus status){
        this.moment = moment;
        this.status = status;
    }
    List<orderItem> statusPedido = new ArrayList<>();

    // Getters and Setters
    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public orderStatus getStatus(){
        return status;
    }
    public void setStatus(orderStatus status){
        this.status = status;
    }
    public List<orderItem> getStatusPedido() {
        return statusPedido;
    }

    // Methods
    public void addItem(orderItem item){
        statusPedido.add(item);
    }
    public void removeItem(orderItem item){
        statusPedido.remove(item);
    }
}
