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
        Conta[] vet;
		vet[0] = new Conta(17, "Pedro Paulo Queiroz", 4200);
        vet[1] = new Conta(11, "Ana Paula Souza", 2500);
        vet[2] = new Conta(21, "Beatriz Miranda de Oliveira", 3800);
        vet[3] = new Conta(10, "Maria Cláudia Santos", 1500);
        vet[4] = new Conta(15, "João Fernando Silva", 1200);
    }
    public static void printContas(Conta[] contas) {}
    public static Transacao[] readTransacoesFake() {}
    public static void printTransacoes(Transacao[] transacoes) {}
    public static void conciliacao(Conta[] contas, Transacao[] transacoes) {}
    public static void OrdenaContasPorId(Conta[] contas) {}
    public static boolean getConta(int idConta, Conta[] contas) {}
}
