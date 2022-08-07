package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        float x, y;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextFloat();
        y = teclado.nextFloat();
        if (x == 0.0 && y == 0.0)
            System.out.println("Origem");
        else if (x > 0 && y > 0)
            System.out.println("Q1");
        else if (x < 0 && y > 0)
            System.out.println("Q2");
        else if (x < 0 && y < 0)
            System.out.println("Q3");
        else if (x > 0 && y < 0)
            System.out.println("Q4");
        teclado.close();
    }
}