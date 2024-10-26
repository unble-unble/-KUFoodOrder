package Repository;

import Entity.Food;
import Entity.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private final Map<String, Order> orders = new HashMap<>();
    private static   OrderRepository memoryorderRepository;

    private OrderRepository() {
    }

    public static OrderRepository getInstance() {
        if ( memoryorderRepository== null) {
            memoryorderRepository = new OrderRepository();
            return memoryorderRepository;
        }
        return memoryorderRepository;
    }

    public void addOrder(Order order) {
        orders.put(order.getOrderId(),order);
    }
    public Collection<Order> findAll() {
        return orders.values();
    }

}
