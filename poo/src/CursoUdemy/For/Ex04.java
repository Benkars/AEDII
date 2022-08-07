package CursoUdemy.For;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int numero, n1, n2;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int aux = 0; aux < numero; aux++) {
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();
            if (n2 == 0) {
                System.out.println("divisão impossível");
            } else {
                float divisao = (float) n1 / n2;
                System.out.println(divisao);
            }
        }
        teclado.close();
    }
}