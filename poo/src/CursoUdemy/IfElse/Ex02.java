package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O núemro informado é par");
        } else
            System.out.println("O núemro informado é impar");
        teclado.close();
    }
}