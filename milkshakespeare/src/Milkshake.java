public class Milkshake extends Pedido {

    private String tamanho;
    private String sabor;

    Milkshake(String tamanho, String sabor) {

        this.sabor = sabor;
        this.tamanho = tamanho;

    }

    public String getSabor() {
        return this.sabor;
    }

    public String getTamanho() {
        return this.tamanho;
    }

}
