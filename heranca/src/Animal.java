public class Animal {

    protected String nome;
    protected String tipo;
    protected String habitat;
    protected String nomeCientifico;
    protected String genero;
    protected int idade;

    public Animal(String nome, String genero, String habitat, int idade, String tipo, String nomeCientifico) {
        this.nome = nome;
        this.genero = genero;
        this.habitat = habitat;
        this.idade = idade;
        this.tipo = tipo;
        this.nomeCientifico = nomeCientifico;
    }

    protected void fazerBarulho() {

        System.out.println("AAAAAAAAAAAAAAAAAA");

    }

    public String getGenero() {
        return genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
