import java.util.Scanner;

public class C8EX14 {
	public static void main(String[] args) {
		char simbolo;
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número entre um e vinte para criar uma matriz quadrada: ");
		numero = teclado.nextInt();
		if (numero < 1 || numero > 20) {
			System.out.print("Informe um número entre um e vinte !");
			numero = teclado.nextInt();
		}
		System.out.print("Informe um símbolo qualquer para preencher a matriz: ");
		simbolo = teclado.next(".").charAt(0);
		for (int lux = 1; lux <= numero; lux++) {
			System.out.println();
			for (int aux = 1; aux <= numero; aux++) {
				System.out.print(" " + simbolo + " ");
			}
		}

		teclado.close();

	}
}
