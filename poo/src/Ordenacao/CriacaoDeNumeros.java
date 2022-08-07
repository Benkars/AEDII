package Ordenacao;

import java.util.Random;

public class CriacaoDeNumeros {
    public static int[] Quantidade(int quantidade) {
        System.out.println("Informe a quantidade de números necessários: ");
        int[]vet = GerarNumeros(quantidade);
        Pritn(vet);
        return vet;
    }

    public static int[] GerarNumeros(int quantidade) {
        int[] vetor = new int[quantidade];
        int numeroAleatorio;
        for (int aux = 0; aux < quantidade; aux++) {
            numeroAleatorio = new Random().nextInt(100);
            vetor[aux] = numeroAleatorio;
        }
        return vetor;
    }

    public static void Pritn(int vet[]) {
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println(vet[aux]);

        }
    }
}