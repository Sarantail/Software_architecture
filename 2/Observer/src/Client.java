
public class Client {

    private String name;

    public Client(String name, Manager manager) {
        this.name = name;
        manager.registerClient(this);
    }

    void update(String news) {
        System.out.println(name + "оповещён об акции:" + news);
    }

}
