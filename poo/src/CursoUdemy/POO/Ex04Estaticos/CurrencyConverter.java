package CursoUdemy.POO.Ex04Estaticos;

public class CurrencyConverter {

    public static double IOF = 1.06;

    public static double valorDolar(float valor, float many) {
        return valor * many * IOF;
    }
}