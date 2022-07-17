import java.util.Scanner;

public class C13EX01 {
	public static void main(String[] args) {
		double x2, y2, x1, y1;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do ponto X1: ");
		x1 = teclado.nextDouble();
		System.out.print("Informe o valor do ponto Y1: ");
		y1 = teclado.nextDouble();
		System.out.print("Informe o valor do ponto X2: ");
		x2 = teclado.nextDouble();
		System.out.print("Informe o valor do ponto Y2: ");
		y2 = teclado.nextDouble();
		System.out.println("A distância entre os pontos informados é de " + Distancia(x1, y1, x2, y2));
		teclado.close();
	}

	static double Distancia(double x1, double y1, double x2, double y2) {
		double distancia;
		distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return distancia;
	}
}