package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preco = 1;
        int codigo, quantidade;
        quantidade = teclado.nextInt();
        codigo = teclado.nextInt();
        if (codigo == 1) {
            preco = quantidade * 4.0;
        } else if (codigo == 2) {
            preco = quantidade * 4.5;
        } else if (codigo == 3) {
            preco = quantidade * 5.0;
        } else if (codigo == 4) {
            preco = quantidade * 2.0;
        } else {
            preco = quantidade * 1.5;
        }
        System.out.println(preco);
        teclado.close();
    }
}