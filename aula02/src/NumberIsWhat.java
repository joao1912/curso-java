import java.util.Scanner;

public class NumberIsWhat {

    public static void execute(Scanner teclado) {

        System.out.print("Me passa um numero ai nego: ");
        int number = Integer.parseInt(teclado.nextLine());

        if (number > 0) {

            System.out.println("Number is positive.");

        } else if (number < 0) {

            System.out.println("Number is negative.");

        } else {

            System.out.println("Number is zero.");

        }

    }

}
