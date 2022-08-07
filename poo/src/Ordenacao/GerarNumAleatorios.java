package Ordenacao;

import java.util.Random;

public class GerarNumAleatorios {
    public static void main(String[] args) {
        int TOTAL_NUMEROS = 10;
        int[] numeros = gerarNumerosAleatorios(TOTAL_NUMEROS);
        printVetorNumeros(numeros);
    }

    public static void printVetorNumeros(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }

    public static int[] gerarNumerosAleatorios(int TOTAL_NUMEROS) {
        int[] vet = new int[TOTAL_NUMEROS];
        int cont = 0;
        while (cont < TOTAL_NUMEROS) {
            int n = gerenateRandonDigits(9);
            if (!contains(n, vet)) {
                vet[cont] = n;
                cont++;
            }
        }
        return vet;
    }

    public static int gerenateRandonDigits(int n) {
        int m = (int) Math.pow(10, n - 1);
        return m + new Random().nextInt(9 * m);
    }

    public static boolean contains(int n, int[] vet) {
        for (int i = 0; i < vet.length; i++)
            if (vet[i] == n) return true;
        return false;
    }
}