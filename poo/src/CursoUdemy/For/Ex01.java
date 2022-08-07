package CursoUdemy.For;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int aux = 1; aux < numero; aux+=2){
            System.out.println(aux);
        }
        teclado.close();
    }
}