public class Fornecedor extends Pessoa {

    private String produto;

    public Fornecedor(String produto, String nome, int id, String senha) {
        super(nome, id, senha);
        this.produto = produto;
    }

    public void verificarEstoque() {
        System.out.println("Olhando o estoque!");
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
