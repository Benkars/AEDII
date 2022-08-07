package CursoUdemy.While;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int x, y;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        y = teclado.nextInt();
        while (x != 0 || y != 0){
            if (x > 0 && y > 0)
                System.out.println("Primeiro");
            if (x < 0 && y > 0)
                System.out.println("Segundo");
            if (x < 0 && y < 0)
                System.out.println("Terceiro");
            if (x > 0 && y < 0)
                System.out.println("Quarto");
            break;
        }
        teclado.close();
    }
}