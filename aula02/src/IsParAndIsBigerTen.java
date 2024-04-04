import java.util.Scanner;

public class IsParAndIsBigerTen {

    public static void execute(Scanner teclado) {

        System.out.println("Digite um numero que eu danço com voce.");

        int number = Integer.parseInt(teclado.nextLine());

        if (number % 2 == 0 && number > 10) {
            System.out.println("O numero é par e maior que 10!");
        } else if (number % 2 != 0 && number > 10) {
            System.out.println("O numero é impar e maior que 10!");
        } else if (number % 2 == 0 && number < 10) {
            System.out.println("O numero é par e menor que 10!");
        } else if (number % 2 != 0 && number < 10) {
            System.out.println("O numero é impar e menor que 10!");
        }

    }

}
