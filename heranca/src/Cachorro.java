public class Cachorro extends Animal {

    public Cachorro(String nome, String genero, String habitat, int idade, String tipo, String nomeCientifico) {
            super(nome, genero, habitat, idade,  tipo,  nomeCientifico);
    }

    protected void morder() {

        System.out.println("O cachorro te mordeu (mas foi sem querer, ou será que não)");

    }

}
