public class Livro extends Pedido {

    private String nome;

    Livro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
