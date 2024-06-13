import java.util.ArrayList;
import java.util.Random;

public class Database {

    private static ArrayList<Pedido> database = new ArrayList<>();

    public static void addOrder(Pedido order) {

        Database.database.add(order);

    }

    public static boolean removeOrderbyId(int id) {

        return Database.database.removeIf(pedido -> (pedido.id == id));

    }

    public static ArrayList<Pedido> getAllOrders() {

        return Database.database;

    }

    public static int generateId() {

        Random random = new Random();
    
        return 10000000 + random.nextInt(90000000);

    }

    public static void makeFakesOrders() {

        Livro livro1 = new Livro("1984");
        Livro livro2 = new Livro("O Senhor dos Anéis");
        Livro livro3 = new Livro("Dom Casmurro");
        Livro livro4 = new Livro("Orgulho e Preconceito");
        Livro livro5 = new Livro("Cem Anos de Solidão");

        Milkshake milkshake1 = new Milkshake("Grande", "Chocolate");
        Milkshake milkshake2 = new Milkshake("Pequenho", "Morango");
        Milkshake milkshake3 = new Milkshake("Pequeno", "Chocolate");
        Milkshake milkshake4 = new Milkshake("Grande", "Morango");
        Milkshake milkshake5 = new Milkshake("Médio", "Chocolate");

        Database.addOrder(milkshake1);
        Database.addOrder(milkshake2);
        Database.addOrder(milkshake3);
        Database.addOrder(milkshake4);
        Database.addOrder(milkshake5);
        Database.addOrder(livro1);
        Database.addOrder(livro2);
        Database.addOrder(livro3);
        Database.addOrder(livro4);
        Database.addOrder(livro5);

    }

}
