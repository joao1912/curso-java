import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean isExited = false;

        Database.makeFakesOrders();

        do {

            generateOptionScreen();

            boolean isValid = false;
            Scanner teclado = new Scanner(System.in);
            int escolhaValida = 1;

            do {

                int escolha = Integer.parseInt(teclado.nextLine());
                if (escolha > 0 && escolha < 8) {
                    escolhaValida = escolha;
                    isValid = true;
                } else {
                    System.out.println("Escolha inválida! Tente denovo.");
                }

            } while (!isValid);

            boolean VOUSAIR = false;
            ArrayList<Pedido> orders;

            switch (escolhaValida) {

                case 1:

                    System.out.println("Nome do Livro: ");
                    String bookName = teclado.nextLine();

                    Livro newBook = new Livro(bookName);
                    Database.addOrder(newBook); 

                    do {

                        System.out.println("Livro adicionado, digite 0 e enter para voltar.");
                        int exit = Integer.parseInt(teclado.nextLine());

                        if (exit == 0) {
                            VOUSAIR = true;
                        }
                        
                    } while (!VOUSAIR);

                    break;

                case 2:

                System.out.println("==========  TAMANHO  ==========");
                System.out.println("1) Pequeno");
                System.out.println("2) Médio");
                System.out.println("3) Grande");
                System.out.println("===============================");
                System.out.print("Escolha: ");

                boolean isValidSize = false;
                String size = "";
                do {
                    int tamanho = Integer.parseInt(teclado.nextLine());

                    if (tamanho > 0 && tamanho < 4) {
                        isValidSize = true;

                        switch (tamanho) {
                            case 1:
                                size = "Pequenho";
                                break;
                            case 2:
                                size = "Médio";
                                break;
                            case 3:
                                size = "Grande";
                                break;
                        }
                    }

                } while (!isValidSize);

                System.out.println("===============================");

                System.out.print("Digite o sabor: ");
                String sabor = teclado.nextLine();

                Milkshake newMilkshake = new Milkshake(size, sabor);

                Database.addOrder(newMilkshake);

                do {

                    System.out.println("Milkshake adicionado, digite 0 e enter para voltar.");
                    int exit = Integer.parseInt(teclado.nextLine());

                    if (exit == 0) {
                        VOUSAIR = true;
                    }
                    
                } while (!VOUSAIR);
                    
                    break;

                case 3:

                    orders = Database.getAllOrders();

                    for(Pedido order: orders) {

                        System.out.println("===============================");

                        if (order instanceof Milkshake) {
                            
                            Milkshake milk = (Milkshake) order;

                            System.out.println("ID: " + milk.id);
                            System.out.println("Sabor: " + milk.getSabor());
                            System.out.println("Tamanho: " + milk.getTamanho());

                        }

                        if (order instanceof Livro) {

                            Livro book = (Livro) order;

                            System.out.println("ID: " + book.id);
                            System.out.println("Nome: " + book.getNome());
                            
                        }

                    }
                    
                    break;

                case 4:

                orders = Database.getAllOrders();

                for(Pedido order: orders) {

                    if (order instanceof Milkshake) {
                        
                        Milkshake milk = (Milkshake) order;

                        Database.removeOrderbyId(milk.id);
                        break;

                    }

                }
                
                    
                    break;
                case 5:

                    orders = Database.getAllOrders();

                    for(Pedido order: orders) {

                        if (order instanceof Livro) {
                            
                            Livro book = (Livro) order;

                            Database.removeOrderbyId(book.id);
                            break;

                        }

                    }

                    break;

                case 6:

                    orders = Database.getAllOrders();

                    Pedido firstOrder = orders.getFirst();

                    Database.removeOrderbyId(firstOrder.id);

                    break;

                case 7:
                    teclado.close();
                    isExited = true;
                    break;
            
                default:
                    break;
            }
            

        } while (!isExited);

    }

    public static void generateOptionScreen() {

        System.out.println("======= Milkshakespeare =======");

        System.out.println("1) Pedir um Livro");
        System.out.println("2) Pedir um Milkshake");
        System.out.println("3) Buscar todos os pedidos");
        System.out.println("4) Botar o junior pra trabalhar");
        System.out.println("5) Botar o pleno pra trabalhar");
        System.out.println("6) Botar o senior pra trabalhar");
        System.out.println("7) Encerrar");

        System.out.println("===============================");

    }
}
