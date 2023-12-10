import java.util.ArrayList;
import java.util.List;

public class Manager implements iShopNews {
    public List<Client> clients;
    public String news;

    public Manager() {
        clients = new ArrayList<>();
    }

    public void setNews(String news) {
        this.news = news;
        notifyClients();
    }

    @Override
    public void registerClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void notifyClients() {
        for (Client client : clients) {

            client.update(news);
        }
    }

}
