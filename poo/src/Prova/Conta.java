package Prova;

public class Conta {

    int codigoConta;

    String nomeCliente;

    float saldoConta;

    public Conta() {
    }

    public Conta(int codigoConta, String nomeCliente, float saldoConta) {
        this.codigoConta = codigoConta;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "O cliente de nome " + nomeCliente + " possui uma conta com código " + codigoConta + " e seu saldo em reais é igual a " + saldoConta;
    }
}