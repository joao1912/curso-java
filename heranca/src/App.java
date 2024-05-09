public class App {
    public static void main(String[] args) throws Exception {
        
        Capivara capivara = new Capivara("tina", "F", "Selva", 3, "Mamifero", "sei la");

        Cachorro cachorro = new Cachorro("Dogin", "M", "Selva", 4, "Mamifero", "Dog da informatica");

        capivara.roer();
        cachorro.morder();

    }
}
