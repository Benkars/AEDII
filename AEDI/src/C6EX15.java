import java.util.Scanner;

public class C6EX15 {
	public static void main(String[] args) {
		double servicoExtra, total, imposto, diaria = 0, valorFixo = 0, codigo, dias;
		String cidade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o código do seu pacote de TV: ");
		codigo = teclado.nextDouble();
		System.out.print("Informe a quantidade de dias de consumo de canais pay-per-view: ");
		dias = teclado.nextDouble();
		System.out.print("Informe o valor dos serviços extras consumidos: ");
		servicoExtra = teclado.nextDouble();
		teclado.nextLine();
		System.out.printf("Informe a cidade do assinante: ");
		cidade = teclado.nextLine();
		if (codigo == 1) {
			valorFixo = 65;
			diaria = 1.2 * dias;
			if (diaria > 65) {
				diaria = 65;
			}
		} else {
			if (codigo == 2) {
				valorFixo = 104;
				diaria = 2.1 * dias;
			} else {
				valorFixo = 137;
				diaria = 0;
			}
		}
		if (cidade.equalsIgnoreCase("Belo Horizonte")) {
			imposto = 0;
		} else {
			if (cidade.equalsIgnoreCase("São Paulo")) {
				imposto = 1 / 100.0;
			} else {
				if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
					imposto = 1.5 / 100.0;
				} else
					imposto = 2 / 100.0;
			}
		}
		total = valorFixo + diaria + servicoExtra + imposto * (valorFixo + diaria + servicoExtra);
		System.out.printf("O total da conta que o assinante deve pagar em reais é de: %1.2f", total);
		teclado.close();
	}

}
