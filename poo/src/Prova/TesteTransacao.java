package Prova;

public class TesteTransacao {
    public static void main(String[] args) {
        Transacao transacao = new Transacao(001,'c',100);
        System.out.println(transacao.toString());
    }
}
