import java.util.ArrayList;
import java.util.List;

public class UserService {

    private ArrayList<User> database = new ArrayList<User>();

    private void addInDataBase(User userData) {

        this.database.add(userData);

    }

    private boolean changeData(User userData) {

        boolean isUpdated = this.database.removeIf(t -> t.getUsername() == userData.getUsername());

        if (isUpdated) {

            this.addInDataBase(userData);

        }

        return isUpdated;

    }

    private boolean deleteByName(String username) {

        return this.database.removeIf(t -> t.getUsername() == username);

    }

    private List<User> findAllUsers() {

        return new ArrayList<>(this.database);

    }

    private User findUserByName(String username) {

        User user = null;

        for (int i = 0; i < this.database.size(); i++) {

            if (this.database.get(i).getUsername() == username) {

                user = this.database.get(i);
                break;

            }

        }

        return user;

    }

    public User create(String username, String email, String password) {

        User user = new User(username, password, email);

        this.addInDataBase(user);

        return user;

    }

    public User update(String username, String email, String password) {

        User user = this.findUserByName(username);

        if (user != null) {

            user.setEmail(email);
            user.setPassword(password);
            boolean isUpdated = this.changeData(user);

            if (!isUpdated) {

                System.out.println("Os dados não foram atualizados!");

            } else {

                System.out.println("Os dados foram atualizados!");

            }

        } else {

            System.out.println("Os dados não foram atualizados!");

        }

        return user;
    }

    public void delete(String username) {

        boolean isDeleted = this.deleteByName(username);

        System.out.println(
                isDeleted ? "O usuário foi deletado com sucesso!" : "O usuário não foi deletado.");

    }

    public ArrayList<User> getAllUsers() {

        return (ArrayList<User>) this.findAllUsers();

    }

}
