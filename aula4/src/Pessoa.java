import java.util.concurrent.TimeoutException;

interface IPerson {

    String getNome();
    int getIdade();
    void setIdade(int idade);

}

public class Pessoa implements  IPerson {

    private final String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
