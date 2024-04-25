public class Conta {

    private int numero;

    private String cliente;
    private float saldo;

    public Conta(int numero, String cliene, float saldo) {

        this.numero = numero;
        this.cliente = cliene;
        this.saldo = saldo;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float value) {

        setSaldo( getSaldo() - value );

    }

    public void depositar(float value) {

        setSaldo( getSaldo() + value );

    }

}
