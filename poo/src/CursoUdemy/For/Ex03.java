package CursoUdemy.For;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        float v1, v2, v3;
        double media = 0;
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        for (int aux = 0; aux < numero; aux++) {
            v1 = teclado.nextFloat();
            v2 = teclado.nextFloat();
            v3 = teclado.nextFloat();
            media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
            System.out.printf("%.1f\n",media);
        }
        teclado.close();
    }
}