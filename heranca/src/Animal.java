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

    

}
