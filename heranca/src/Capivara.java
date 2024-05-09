public class Capivara extends Animal {

    public Capivara(String nome, String genero, String habitat, int idade, String tipo, String nomeCientifico) {
            super(nome, genero, habitat, idade,  tipo,  nomeCientifico);
    }

    protected void roer() {

        System.out.println("A capivara te roeu (mas foi sem querer)");

    }

}
