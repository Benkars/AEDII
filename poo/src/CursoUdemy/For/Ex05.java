package CursoUdemy.For;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int numero, soma = 1;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int aux = 1; aux <= numero; aux++)
            soma *= aux;
        System.out.println(soma);
        teclado.close();
    }
}