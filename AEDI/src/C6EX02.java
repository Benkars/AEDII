import java.util.Scanner;

public class C6EX02 {
	public static void main(String[] args) {
		double poluente, valorMulta;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do poluente emitido: ");
		poluente = teclado.nextDouble();
		if (poluente <= 1500)
			valorMulta = 0;
		else {
			if (poluente > 1500 && poluente <= 3500) {
				valorMulta = 3000;
			} else
				valorMulta = (5000 * poluente);
		}
		System.out.printf("O valor da multa em reais é de %1.2f", valorMulta);
		teclado.close();
	}
}