package Prova;

public class Transacao {

    int codigoConta;

    char operacaoTransacao;

    float valorTransacao;

    public Transacao() {
    }

    public Transacao(int codigoConta, char operacaoTransacao, float valorTransacao) {
        this.codigoConta = codigoConta;
        this.operacaoTransacao = operacaoTransacao;
        this.valorTransacao = valorTransacao;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }

    public char getOperacaoTransacao() {
        return operacaoTransacao;
    }

    public void setOperacaoTransacao(char operacaoTransacao) {
        this.operacaoTransacao = operacaoTransacao;
    }

    public float getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(float valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String toString() {
        return "A conta de c?digo " + codigoConta + " realizou uma opera??o de " + operacaoTransacao +
                " e o valor da transa??o em reais ? de "+ valorTransacao;
    }
}