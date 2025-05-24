import dao.UserDAO;
import model.User;

public class Main {
    public static void main(String[] args) {
        try {
            User user = new User(0, "john", "1234", "JOB_SEEKER");
            UserDAO dao = new UserDAO();
            dao.createUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}