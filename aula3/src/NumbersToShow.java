import javax.swing.*;

public class NumbersToShow {

    public static void execute() {

        int[] numbers = new int[10];

        for (int i = 0 ; i < 10 ; i++) {

            int number;
            do {

                number = Integer.parseInt(JOptionPane.showInputDialog("Numero " + (i + 1) + ": "));

            } while (number < 1 || number > 100);

            numbers[i] = number;

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
