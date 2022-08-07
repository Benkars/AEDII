package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int a, b;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        if (a % b == 0 || b % a == 0)
            System.out.println("Os números informados são múltiplos");
        else
            System.out.println("Os números informados não são múltiplos");
        teclado.close();
    }
}