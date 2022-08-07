package CursoUdemy.Basico;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        int[] vet = new int[4];
        Scanner teclado = new Scanner(System.in);
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Informe um valor inteiro: ");
            vet[aux] = teclado.nextInt();
        }
        diferenca = vet[0]*vet[1]-vet[2]*vet[3];
        System.out.println("O valor da a diferença do produto de A e B pelo produto de C e D é " + diferenca);
        teclado.close();
    }
}