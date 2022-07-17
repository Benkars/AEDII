import java.util.Scanner;

public class C6EX14 {
	public static void main(String[] args) {
		long numero, resto1, resto2, resto3, resto4;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o um número de quatro dígitos: ");
		numero = teclado.nextLong();
		resto1 = numero % 10;
		resto2 = numero % 100 / 10;
		resto3 = numero % 1000 / 100;
		resto4 = numero / 1000;
		if (numero / 10000 > 0 || numero / 1000 < 1) {
			System.out.print("O número precisa ter 4 dígitos");
		}
		else
		System.out.printf("Impressão = %d%d%d%d", resto1, resto2, resto3, resto4);

		teclado.close();

	}

}
