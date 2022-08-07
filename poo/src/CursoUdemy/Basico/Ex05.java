package CursoUdemy.Basico;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int numero, numero2,c1,c2;
        float valorUnitario, valorUnitario2, valorFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o código da peça: ");
        c1 = teclado.nextInt();
        System.out.println("Informe o número de peças: ");
        numero = teclado.nextInt();
        System.out.println("Informe o valor unitário da peça;");
        valorUnitario = teclado.nextFloat();
        System.out.println("------------------");
        System.out.println("Informe o código da peça: ");
        c2 = teclado.nextInt();
        System.out.println("Informe o número de peças: ");
        numero2 = teclado.nextInt();
        System.out.println("Informe o valor unitário da peça;");
        valorUnitario2 = teclado.nextFloat();
        valorFinal = numero * valorUnitario + numero2 * valorUnitario2;
        System.out.println("O valor final é de R$" + valorFinal);
        teclado.close();
    }
}