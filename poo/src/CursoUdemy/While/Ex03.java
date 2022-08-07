package CursoUdemy.While;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int codigo = 0, cont1 = 0, cont2 = 0, cont3 = 0;
        Scanner teclado = new Scanner(System.in);
        while (codigo != 4) {
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt();
            switch (codigo) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO\nFim");
                    break;
            }
        }
        System.out.println("Alcool: " + cont1 + "\nGasolina: " + cont2 + "\nDiesel: " + cont3);
        teclado.close();
    }
}