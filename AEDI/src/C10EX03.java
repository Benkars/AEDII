import java.util.Scanner;

public class C10EX03 {
	public static void main(String[] args) {
		double angulo, raio, area = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o valor de α (ângulo): ");
			angulo = teclado.nextDouble();
			System.out.print("Informe o valor do raio: ");
			raio = teclado.nextDouble();
			if (raio != -1) {
				area = (angulo * 3.1416 * Math.pow(raio, 2)) / 360.0;
				System.out.println("O valor do raio é de " + area);
			}
		} while (raio != -1);
		teclado.close();
	}
}
