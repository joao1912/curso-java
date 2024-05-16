import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Banco t  = new Banco();

        t.setContentPane(t.painelPrincipal);
        t.setVisible(true);
        t.setTitle("$$SIMULATOR$$");
        t.setSize(900, 600);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}