import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Banco extends JFrame {
    private JTextField inptUsername;
    private JPasswordField inptPassword;
    private JTextField inptEmail;
    private JButton btnCadastrar;
    private JButton btnLocalizar;
    private JButton btnEditar;
    private JButton btnApagar;
    private JButton btnMostrarTudo;
    private JTextArea areaText;
    private JButton fakeButton;
    public JPanel painelPrincipal;

    public Banco() {

        UserService userService = new UserService();

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = inptUsername.getText();
                String password = inptPassword.getText();
                String email = inptEmail.getText();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
                    return;
                }

                User newUser = userService.create(username, email, password);

                inptUsername.setText("");
                inptPassword.setText("");
                inptEmail.setText("");
                showAllUsers(userService);

                JOptionPane.showMessageDialog(null, "Usuário de nome " + newUser.getUsername() + " foi criado!");

            }
        });

        btnLocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = inptUsername.getText();


                User user = userService.findUserByName(username);

                areaText.setText("");

                if (user != null) {
                    areaText.append("\nNome: " + user.getUsername());
                    areaText.append("\nPassword: " + user.getPassword());
                    areaText.append("\nEmail: " + user.getEmail());
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
                showAllUsers(userService);

                inptUsername.setText("");
                inptPassword.setText("");
                inptEmail.setText("");

            }
        });

        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = inptUsername.getText();
                String password = inptPassword.getText();
                String email = inptEmail.getText();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
                    return;
                }

                User user = userService.update(username, email, password);

                if (user == null) {
                    JOptionPane.showMessageDialog(null, "Usuário de nome " + username + " não foi encontrado!");
                    return;
                }
                inptUsername.setText("");
                inptPassword.setText("");
                inptEmail.setText("");
                showAllUsers(userService);
                JOptionPane.showMessageDialog(null, "Usuário atualizado!");

            }
        });

        btnApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = inptUsername.getText();

                boolean isDeleted = userService.delete(username);

                areaText.setText("");

                inptUsername.setText("");
                inptPassword.setText("");
                inptEmail.setText("");
                showAllUsers(userService);

                if (isDeleted) {
                    JOptionPane.showMessageDialog(null, "O usuário foi deletado!");
                } else {
                    JOptionPane.showMessageDialog(null, "O usuário não encontrado!");
                }

            }
        });

        btnMostrarTudo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                inptUsername.setText("");
                inptPassword.setText("");
                inptEmail.setText("");

                showAllUsers(userService);

            }
        });

        fakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                inptUsername.setText("");
                inptPassword.setText("");
                inptEmail.setText("");

                for (int i = 0; i < 3; i++) {

                    String username = "usuario " + i;

                    String email = "email" + i + "@gmail.com";

                    String password = "senha " + i;

                    userService.create(username, email, password);

                }

                showAllUsers(userService);
                JOptionPane.showMessageDialog(null, "Usuários fakes criados!");

            }
        });
    }

    private void showAllUsers(UserService userService) {

        inptUsername.setText("");
        inptPassword.setText("");
        inptEmail.setText("");

        ArrayList<User> users = userService.getAllUsers();
        areaText.setText("");

        for (User user : users) {


            areaText.append("\n\nNome: " + user.getUsername());
            areaText.append("\nPassword: " + user.getPassword());
            areaText.append("\nEmail: " + user.getEmail());

        }

    }

}
