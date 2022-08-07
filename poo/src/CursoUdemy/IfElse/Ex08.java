package CursoUdemy.IfElse;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        float renda;
        double imposto;
        Scanner teclado = new Scanner(System.in);
        renda = teclado.nextFloat();
        if (renda > 0.0 && renda <= 2000)
            imposto = 0;
        else if (renda > 2000 && renda <= 3000)
            imposto = 0.08 * (renda - 2000);
        else if (renda > 3000 && renda <= 4500)
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        else
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        System.out.printf("%.2f", imposto);
        teclado.close();
    }
}