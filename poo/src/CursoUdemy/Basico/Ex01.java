package CursoUdemy.Basico;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de um número inteiro: ");
        n1 = teclado.nextInt();
        System.out.println("Informe o valor de outro número inteiro: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;
        System.out.println("O valor da soma desses dois númerso inteiros é " + soma);
        teclado.close();
    }
}