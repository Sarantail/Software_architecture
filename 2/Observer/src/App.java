public class App {
    public static void main(String[] args) throws Exception {
        var manager = new Manager();

        new Client("Клиент_1 ", manager);
        new Client("Клиент_2 ", manager);

        manager.setNews(" Скидки на всё!");
    }
}
