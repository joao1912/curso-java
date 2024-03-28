
public class Main {

    static String name = "João";
    static int age = 19;

    public static void main(String[] args) {

        System.out.printf("Nome: %S | Idade: %d ", name, age);

        int num1 = 3;
        int num2 = 5;

        int sumNumber = Sum.execute(num1, num2);

        System.out.printf("Soma de %d + %d == %d", num1, num2, sumNumber);
    }
}
