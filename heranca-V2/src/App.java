import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Aluno aluno = new Aluno("Desenvolvimento de Sistemas", "Dalison", 1, "1234");

        aluno.fazerMatricula("Mecânica de foguetes");

        pessoas.add(aluno);

        Aluno a = (Aluno) pessoas.getFirst();

        a.getCurso();

        

    }
}
