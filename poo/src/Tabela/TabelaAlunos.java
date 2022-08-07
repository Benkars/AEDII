package Tabela;

// Indice da tabela é o número de matrícula

public class TabelaAlunos {
    private int maxMatric;
    public int nPos;
    private String alunos[];

    public TabelaAlunos(int nd) {
        nPos = (int) (Math.pow(10, nd) + 0.5);
        alunos = new String[nPos];
        maxMatric = nPos - 1;
    }

    public void adicionaAluno(int matr, String nome) {
        alunos[matr] = nome;
    }

    public String obtemAluno(int matr) {
        return alunos[matr];
    }

    public void imprimeTabelaAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null)
                System.out.printf("%d: %s\n", i, alunos[i]);
        }
        System.out.println(nPos);
    }
}