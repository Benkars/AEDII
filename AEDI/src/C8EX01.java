import java.util.Scanner;

public class C8EX01 {
	public static void main(String[] args) {
		double pi = 3.1416, raio, area;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o valor do raio: ");
			raio = teclado.nextDouble();
			area = pi * Math.pow(raio, 2);
			System.out.println("Para raio = " + raio + "O valor da área é de " + area);
		}
		teclado.close();
	}
}