package enumeracao_composicao.exercicios.order.entities;
import enumeracao_composicao.exercicios.order.entities.orderItem;
import enumeracao_composicao.exercicios.order.entities.orderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private orderStatus status;
    private client cliente;
    List<orderItem> statusPedidos = new ArrayList<>();

    // Contructor
    public order(Date moment, orderStatus status, client cliente){
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    // Getters and Setters
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public orderStatus getStatus(){
        return status;
    }
    public void setStatus(orderStatus status){
        this.status = status;
    }
    public List<orderItem> getStatusPedido() {
        return statusPedidos;
    }

    // Methods
    public void addItem(orderItem item){
        statusPedidos.add(item);
    }
    public void removeItem(orderItem item){
        statusPedidos.remove(item);
    }

    public Double total(){
        double total = 0;
        for(orderItem statusPedido : statusPedidos){
            total += statusPedido.subTotal();
        }
        return total;
    }
}
