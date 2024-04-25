import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        TelaSimulator t = new TelaSimulator();

        t.setContentPane(t.painelPrincipal);
        t.setVisible(true);
        t.setTitle("$$SIMULATOR$$");
        t.setSize(400, 400);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}