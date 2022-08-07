package CursoUdemy.Basico;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        double areaT, areaC, areaTp, areaQ, areaR;
        float[] vet = new float[3];
        Scanner teclado = new Scanner(System.in);
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Informe o primeiro valor: ");
            vet[aux] = teclado.nextFloat();
        }
        areaT = vet[0] * vet[2] / 2;
        areaC = Math.pow(vet[2], 2) * 3.14159;
        areaTp = (vet[0] + vet[1]) * vet[2] / 2;
        areaQ = vet[1] * 4;
        areaR = vet[0] * vet[1];
        System.out.printf("TRIÂNGULO: %.3f\nCÍRCULO: %.3f\nTRAPÉZIO: %.3f\nQUADRADO: %.3f\nRETÂNGULO: %.3f",
                areaT, areaC, areaTp, areaQ, areaR);
        teclado.close();
    }
}