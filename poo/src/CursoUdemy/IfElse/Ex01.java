package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("O número informado é positivo");
        } else
            System.out.println("O número informado é negativo");
        teclado.close();
    }
}