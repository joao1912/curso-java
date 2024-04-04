import java.util.Scanner;
import javax.swing.*;

public class Main {

    private static boolean isValid(float nota) {

        if (nota < 0 || nota > 10) return false;

        return  true;

    }
    public static void main(String[] args) {

//        Scanner teclado = new Scanner(System.in);
//
//        System.out.print("Nome: ");
//        String nome = teclado.nextLine();
//
//        float nota1;
//        float nota2;
//        float nota3;
//
//        do {
//            System.out.print("Nota 1: ");
//            nota1 = teclado.nextFloat();
//        } while ( !isValid(nota1) );
//
//        do {
//            System.out.print("Nota 2: ");
//            nota2 = teclado.nextFloat();
//        } while ( !isValid(nota2) );
//
//        do {
//            System.out.print("Nota 3: ");
//            nota3 = teclado.nextFloat();
//        } while ( !isValid(nota3) );
//
//        float media = (nota1 + nota2 + nota3) / 3;
//
//        System.out.printf("A media do aluno %s foi %.1f\n", nome, media);
//
//        if (media >= 7) {
//            System.out.println("ELE PASSOU!");
//        } else {
//            System.out.println("ELE NÃO PASSOU!");
//        }

        JOptionPane.showMessageDialog(null, "teste");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("sua idade: "));

        System.out.println(idade);
    }

}
