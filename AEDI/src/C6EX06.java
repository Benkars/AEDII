import java.util.Scanner;

public class C6EX06 {
	public static void main(String[] args) {
		double delta, raiz1, raiz2,valorA, valorB, valorC;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor de A: ");
		valorA = teclado.nextDouble();
		System.out.print("Informe o valor de B: ");
		valorB = teclado.nextDouble();
		System.out.print("Informe o valor de C: ");
		valorC = teclado.nextDouble();
		delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
		if (delta == 0) {
			raiz1 = (-valorB + Math.sqrt(delta)) / (2.0 * valorA);
			System.out.println("Para A = "+valorA+", B= "+valorB+" e C = "+valorC+", teremos uma raiz = "+raiz1);
		} else {
			if (delta > 0) {
				raiz1 = (-valorB + Math.sqrt(delta)) / (2.0 * valorA);
				raiz2 = (-valorB - Math.sqrt(delta)) / (2.0 * valorA);
				System.out.println("Para A = "+valorA+", B= "+valorB+" e C = "+valorC+", teremos duas raízes = "+raiz1+" e "+raiz2);
			} else {
				System.out.println("Para A = "+valorA+", B= "+valorB+" e C = "+valorC+", não teremos nenhuma raiz.");
			}

		}

		teclado.close();

	}

}
