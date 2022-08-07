package CursoUdemy.For;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int n;
        double valor;
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        for (int aux = 1; aux <= n; aux++) {
            for (int lux = 1; lux < 4; lux++) {
                valor = Math.pow((n - aux + 1), lux);
                System.out.print(" " + valor + " ");
            }
            System.out.println();
        }
        teclado.close();
    }
}