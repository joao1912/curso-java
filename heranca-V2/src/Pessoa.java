public class Pessoa {

    private String nome;
    private int id;
    private String senha;

    public Pessoa(String nome, int id, String senha) {

        this.nome = nome;
        this.id = id;
        this.senha = senha;

    }

    public void mudarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.id;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
