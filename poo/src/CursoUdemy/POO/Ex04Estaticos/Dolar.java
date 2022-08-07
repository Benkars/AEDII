package CursoUdemy.POO.Ex04Estaticos;

import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        float valor, many;
        Scanner teclado = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        valor = teclado.nextFloat();
        System.out.println("How many dollars will be bought? ");
        many = teclado.nextFloat();

        double total = CurrencyConverter.valorDolar(valor, many);

        System.out.println("Amount to be paid in reais = " + total + " valor IOF = " + CurrencyConverter.IOF);

        teclado.close();
    }
}