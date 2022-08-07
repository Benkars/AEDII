package CursoUdemy.POO.Ex01;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor da largura do retângulo: ");
        retangulo.width = teclado.nextDouble();
        System.out.print("Informe o valor da largura do retângulo: ");
        retangulo.height = teclado.nextDouble();

        System.out.println(retangulo);

        teclado.close();
    }
}