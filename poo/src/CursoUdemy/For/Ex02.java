package CursoUdemy.For;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int numeroRep, cont = 0, numero = 0, intervalo;
        Scanner teclado = new Scanner(System.in);
        numeroRep = teclado.nextInt();
        for (int aux = 0; aux < numeroRep; aux++) {
            System.out.print("Informe outro número: ");
            numero = teclado.nextInt();
            if (numero >= 10 && numero <= 20)
                cont++;
        }
        intervalo = numeroRep - cont;
        System.out.printf("%d in\n%d out",cont,intervalo);
        teclado.close();
    }
}