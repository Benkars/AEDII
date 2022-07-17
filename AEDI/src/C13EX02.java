import java.util.Scanner;

public class C13EX02 {
	public static void main(String[] args) {
		double x;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o valor de X: ");
			x = teclado.nextDouble();
			if (x == -1)
				break;
			System.out.println("O valor de F(" + x + ") é de " + funcao(x));
		} while (x != -1);
		teclado.close();
	}

	static double funcao(double X) {
		if (X < 4) {
			return (5 * X + 3) / (Math.sqrt(16 - Math.pow(X, 2)));
		} else if (X == 4) {
			return 0;
		} else
			return (5 * X + 3) / (Math.sqrt(Math.pow(X, 2) - 16));
	}
}