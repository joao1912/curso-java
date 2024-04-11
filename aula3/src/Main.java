import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1 ; i <= 10 ; i++) {

            int number;
            do {

                number = Integer.parseInt(JOptionPane.showInputDialog("Numero " + i + ": "));

            } while (number < 1 || number > 100);

            numbers.add(number);


        }

        int numberBig = 0;

        for (int number : numbers) {

            if (numberBig < number) {
                numberBig = number;
            }

        }

        JOptionPane.showMessageDialog(null, "O Maior numero entregue foi: " + numberBig);

    }

}
