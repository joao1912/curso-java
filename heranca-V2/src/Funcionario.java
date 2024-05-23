public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String cargo, String nome, int id, String senha) {
        super(nome, id, senha);
        this.cargo = cargo;
    }

    public void botarCulpaNoEstagiario() {
        System.out.println("Alguem cagou com o código e claramente não foi eu...");
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
