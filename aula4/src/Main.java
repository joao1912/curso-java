import java.util.ArrayList;

public class Main {

    public static ArrayList<Pessoa> GeradorDePessoas() {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        for (int i = 0 ; i < 10 ; i++) {

            Pessoa pessoa = new Pessoa("pessoa " + i, 18 + i);

            pessoas.add(pessoa);

        }

        return pessoas;

    }

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = Main.GeradorDePessoas();

        for (Pessoa pessoa: pessoas) {

            System.out.print("\n-------------------------------------");
            System.out.printf("\nNome: %s", pessoa.getNome());
            System.out.printf("\nIdade: %d", pessoa.getIdade());

        }

    }
}

