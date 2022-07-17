import java.util.Scanner;

public class C11EX03 {
	public static void main(String[] args) {
		int dia = 0, pontos, cont = 0;
		String placa;
		double valor = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		while (dia != 99) {
			System.out.print("Informe o dia do mês que ocorreu a multa: ");
			dia = teclado.nextInt();
			if (dia == 99) {
				break;
			}
			System.out.print("Informe a placa do automóvel: ");
			teclado.nextLine();
			placa = teclado.nextLine();
			System.out.print("Informe o número de pontos da multa: ");
			pontos = teclado.nextInt();
			if (pontos == 3) {
				valor = 42;
			} else {
				if (pontos == 5) {
					valor = 108;
				} else {
					valor = 479;
					if (dia <= 15) {
						cont++;
					}
				}
			}
			soma += valor;
			System.out.println("A placa " + placa + " teve uma multa no valor de " + valor);
		}
		System.out.println("A quantidade de multas de pontuação 8 da primeira quinzena do mês é de " + cont);
		System.out.println("O valor total arrecadado com as multas em reais é " + soma);
		teclado.close();
	}
}
