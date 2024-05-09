
public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 3; i++) {
            
            String username = "usuario " + i;

            String email = "email " + i + "@gmail.com";

            String password = "senha " + i;

            UserService userService = new UserService();

            userService.create(username, password, email);

        }

    }
}
