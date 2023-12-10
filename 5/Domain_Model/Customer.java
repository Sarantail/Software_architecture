package HomeWork_05.Domain_Model;

import java.util.ArrayList;
import java.util.List;

// Класс "Клиент"
class Customer {
    private String customerId;
    private String name;
    private List<Order> orders;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
    
    public void addOrder(Order order) {
        orders.add(order);
    }
}
