package HomeWork_05.Domain_Model;

// Пример использования классов модели домена
public class Main {
    public static void main(String[] args) {
        // Создаем клиента
        Customer customer = new Customer("1", "Иван Иванов");
        
        // Создаем продукты
        Product product1 = new Product("1", "Телефон", 10000.0);
        Product product2 = new Product("2", "Ноутбук", 50000.0);
        
        // Создаем заказ и добавляем продукты
        Order order = new Order("1");
        order.addProduct(product1);
        order.addProduct(product2);
        
        // Добавляем заказ клиенту
        customer.addOrder(order);
        
        // Выводим информацию о клиенте и его заказах
        System.out.println("Клиент: " + customer.getName());
        System.out.println("Заказы:");
        for (Order customerOrder : customer.getOrders()) {
            System.out.println("Заказ №" + customerOrder.getOrderId());
            System.out.println("Товары:");
            for (Product product : customerOrder.getProducts()) {
                System.out.println("- " + product.getName() + " (" + product.getPrice() + " руб.)");
            }
            System.out.println();
        }
    }
}
