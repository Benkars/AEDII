package CursoUdemy.Basico;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, area, pi = 3.14159;
        System.out.println("informe o valor do raio: ");
        raio = teclado.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.println("O valor da área é de " + area);
        teclado.close();
    }
}