public class Estagiario extends Aluno {

    private double salario;

    public Estagiario(double salario, String curso, String nome, int id, String senha) {
        super(curso, nome, id, senha);
        this.salario = salario;
    }

    public void  fazerCafe() {
        System.out.println("Fazendo café...");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
