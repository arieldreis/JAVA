package enumeracao_composicao;
import enumeracao_composicao.entities.Order;
import enumeracao_composicao.entities.enums.OrderStatus;
import java.util.Date;

public class enumeracao_composicao01 {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
