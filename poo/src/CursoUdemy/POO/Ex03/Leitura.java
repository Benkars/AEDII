package CursoUdemy.POO.Ex03;

public class Leitura {
    public String nome;
    public float n1, n2, n3;

    public float totalNota() {
        float soma = n1 + n2 + n3;
        return soma;
    }

    public String aprovacao() {
        if (totalNota() < 60) {
            return "O aluno " + nome + " não passou !\n" +
                    "Faltam " + (60 - totalNota()) + " pontos";
        } else return "O aluno " + nome + " passou !\n" +
                "Nota final = " + totalNota() + " pontos";
    }
}