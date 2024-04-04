import java.util.Scanner;

public class IsBissexto {

    public static void execute(Scanner teclado) {

        System.out.print("Me passa um ano ai nego: ");
        int ano = Integer.parseInt(teclado.nextLine());

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

            System.out.println("O ano é bissexto!");

        } else  {

            System.out.println("O ano não é bissexto!");

        }

    }

}
