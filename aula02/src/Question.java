import java.util.Scanner;

public class Question {

    public static  void execute(Scanner teclado) {

        System.out.println("Me passa ai os lados do triangulo que eu me viro nos 30.");

        System.out.print("Lado 1: ");
        float lado1 = Float.parseFloat(teclado.nextLine());

        System.out.print("Lado 2: ");
        float lado2 = Float.parseFloat(teclado.nextLine());

        System.out.print("Lado 3: ");
        float lado3 = Float.parseFloat(teclado.nextLine());

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triangulo é equilatero.");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.println("O triangulo é escaleno.");
        } else {
            System.out.println("O triangulo é isósceles");
        }
    }

}
