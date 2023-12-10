package HomeWork_05.DAO;

// Интерфейс DAO
public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUser(String name);
}