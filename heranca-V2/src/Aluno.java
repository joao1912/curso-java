public class Aluno extends Pessoa {

    private String curso;

    public Aluno(String curso, String nome, int id, String senha) {
        super(nome, id, senha);
        this.curso = curso;
    }

    protected void fazerMatricula(String nomeCurso) {

        this.setCurso(nomeCurso);

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
