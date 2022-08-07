package Prova;

public class TesteConta {

    public static void main(String args[]) {
        Conta[] contas = readContasFake();
        printContas(contas);

        Transacao[] transacoes = readTransacoesFake();
        printTransacoes(transacoes);

        conciliacao(contas, transacoes);
        OrdenaContasPorId(contas);
        printContas(contas);

        System.out.println("\nTestes existência de contas:");
        System.out.println("=============================");
        System.out.println("Conta 10: " + getConta(10, contas));
        System.out.println("Conta 50: " + getConta(50, contas));
    }

    public static Conta[] readContasFake() {
        Conta[] vet = new Conta[5];
        vet[0] = new Conta(17, "Pedro Paulo Queiroz", 4200);
        vet[1] = new Conta(11, "Ana Paula Souza", 2500);
        vet[2] = new Conta(21, "Beatriz Miranda de Oliveira", 3800);
        vet[3] = new Conta(10, "Maria Cláudia Santos", 1500);
        vet[4] = new Conta(15, "João Fernando Silva", 1200);
        return vet;
    }

    public static void printContas(Conta[] contas) {
        for (int i = 0; i < 5; i++)
            System.out.println(contas[i]);
        System.out.println("-----------------------------------------------");
    }

    public static Transacao[] readTransacoesFake() {
        Transacao[] vet = new Transacao[10];
        vet[0] = new Transacao(10, 'c', 100);
        vet[1] = new Transacao(21, 'd', 250);
        vet[2] = new Transacao(17, 'c', 300);
        vet[3] = new Transacao(15, 'd', 200);
        vet[4] = new Transacao(10, 'c', 400);
        vet[5] = new Transacao(11, 'c', 1000);
        vet[6] = new Transacao(21, 'c', 250);
        vet[7] = new Transacao(11, 'd', 800);
        vet[8] = new Transacao(17, 'd', 50);
        vet[9] = new Transacao(10, 'd', 300);
        return vet;
    }

    public static void printTransacoes(Transacao[] transacoes) {
        for (int i = 0; i < 10; i++)
            System.out.println(transacoes[i]);
        System.out.println("-----------------------------------------------");
    }

    public static void conciliacao(Conta[] contas, Transacao[] transacoes) {
        float valorFinal;
        for (int i = 0; i > transacoes.length; i++) {
            for (int aux = 0; aux < contas.length; aux++) {
                if (transacoes[i].getCodigoConta() == contas[aux].getCodigoConta()) {
                    if (transacoes[i].getOperacaoTransacao() == 'c') {
                        contas[aux].setSaldoConta(contas[aux].getSaldoConta() + transacoes[i].getValorTransacao());
                    } else if (transacoes[i].getOperacaoTransacao() == 'd') {
                        contas[aux].setSaldoConta(contas[aux].getSaldoConta() - transacoes[i].getValorTransacao());
                    }
                }
            }
        }
    }

    public static void OrdenaContasPorId(Conta[] contas) {
        for (int i = 0; i < contas.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (contas[j].getCodigoConta() > contas[j + 1].getCodigoConta()) {
                    Conta aux = contas[j];
                    contas[j] = contas[j + 1];
                    contas[j + 1] = aux;
                }
            }
        }
    }


    public static boolean getConta(int idConta, Conta[] contas) {
        for (Conta conta : contas)
            if (conta.getCodigoConta() == idConta) return true;
        return false;
    }
}