package CursoUdemy.For;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int aux = 1; aux <= numero; aux++) {
            if (numero % aux == 0)
                System.out.println(aux);
        }
        teclado.close();
    }
}