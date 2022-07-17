import java.util.Scanner;

public class C10EX01 {
	public static void main(String[] args) {
		double multa = 0, valor, media = 0, soma = 0;
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o valor da multa em reais: ");
			valor = teclado.nextDouble();
			if (valor != - 1) {
				multa = valor / 10.0;
				soma += multa;
				cont++;
				media = soma / cont;
			}
			System.out.println();
			System.out.println("O valor da multa é de R$ " + multa);
		} while (valor != - 1);
		System.out.println("O valor das médias das multas é de R$ " + media);
		teclado.close();
	}
}
