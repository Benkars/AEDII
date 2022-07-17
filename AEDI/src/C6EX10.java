import java.util.Scanner;

public class C6EX10 {
	public static void main(String[] args) {
		Double capital, taxaDiaria, valorResgatado, rendimento;
		int dias;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do capital aplicado em reais: ");
		capital = teclado.nextDouble();
		System.out.print("Informe o número de dias que ficou aplicado: ");
		dias = teclado.nextInt();
		System.out.print("Informe o valor da taxa diária da finaceira: ");
		taxaDiaria = teclado.nextDouble();
		rendimento = capital * taxaDiaria / 100 * dias;
		valorResgatado = capital + rendimento * 0.85 - 10;
		System.out.printf("O valor resgatado em reais é de %1.2f", valorResgatado);
		teclado.close();

	}

}
