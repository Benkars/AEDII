package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int hI, hF;
        Scanner teclado = new Scanner(System.in);
        hI = teclado.nextInt();
        hF = teclado.nextInt();
        if (hI < hF){
            System.out.println("A duração em horas foi de "+(hF-hI));
        }else
            System.out.println("A duração em horas foi de "+(-hI + hF + 24));
        teclado.close();
    }
}