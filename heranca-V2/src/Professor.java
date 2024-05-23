public class Professor extends Pessoa {

    private String area;

    public Professor(String area, String nome, int id, String senha) {
        super(nome, id, senha);
        this.area = area;
    }

    public void fazerChamada() {
        System.out.println("João");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
