import javax.swing.*;

public class Wage {

    public static void  execute() {

        int numWage;

        numWage = Integer.parseInt(JOptionPane.showInputDialog("Quantos salarios deseja registrar: "));

        float[] wages = new float[numWage];

        for (int i = 0 ; i < numWage ; i++) {

            float wage = Float.parseFloat(JOptionPane.showInputDialog("Digito o salário ("+i+"): "));

            if (wage < 2500) {
                wage = wage + ((wage * 10)/100);
            }

            wages[i] = wage;

        }


    }

}
