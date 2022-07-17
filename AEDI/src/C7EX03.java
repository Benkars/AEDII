import java.util.Scanner;

public class C7EX03 {
	public static void main(String[] args) {
		double imposto, valorMulta;
		int dias;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do imposto em reais: ");
		imposto = teclado.nextDouble();
		System.out.println("Informe o número de dias de atraso: ");
		dias = teclado.nextInt();
		switch (dias) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("O valor da multa em reais é igual a 0,00");
			break;
		case 6:
		case 7:
		case 8:
			valorMulta = imposto * 2 / 100;
			System.out.println("O valor da multa em reais é igual a " + valorMulta);
			break;
		case 9:
		case 10:
			valorMulta = imposto * 10 / 100 + dias * 5 / 1000;
			System.out.println("O valor da multa em reais é igual a " + valorMulta);
			break;
		default:
			valorMulta = imposto * 150 / 100 + dias * 1;
			System.out.println("O valor da multa em reais é igual a " + valorMulta);
			break;

		}

		teclado.close();

	}

}
