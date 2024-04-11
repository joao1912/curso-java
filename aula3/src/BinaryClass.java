import java.util.Arrays;

public class BinaryClass {

    public static void execute() {

        //precisa do array ordenado

        int[] numeros = {2,6,4,7,9,3,1,5,13};

        Arrays.sort(numeros);

        int pos = Arrays.binarySearch(numeros, 5);

        System.out.println("Posição do numero 5: " + pos);

    }

}
