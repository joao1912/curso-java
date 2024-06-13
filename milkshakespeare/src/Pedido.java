public class Pedido {

    int id;
    private boolean concluido = false;

    Pedido() {

        this.id = Database.generateId();

    }

    public void concluir() {

        this.concluido = true;

    }

    public boolean getConcluido() {

        return this.concluido;

    }


}