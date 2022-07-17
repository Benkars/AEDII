import java.util.Scanner;

public class E01772A {
	public static void main(String[] args) {
		// BERNARDO CABRAL BERTOLDI TRIGUEIRO
		String codigo;
		int parcela, cont = 0, cont2 = 0, aux = 0;
		double iptu, reajuste = 0, valor, soma = 0, media = 0, iptuMenor = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			aux++;
			System.out.print("Informe o c�digo da sua regi�o: ");
			codigo = teclado.nextLine();
			if (codigo.equalsIgnoreCase("X"))
				break;
			System.out.print("Informe o valor do IPTU em reais: ");
			iptu = teclado.nextDouble();
			System.out.print("Informe o n�mero de parcelas que deseja pagar o IPTU (M�ximo 12 parcelas): ");
			parcela = teclado.nextInt();
			teclado.nextLine();
			if (codigo.equalsIgnoreCase("S")) {
				cont++;
				reajuste = 1.0875;
			} else if (codigo.equalsIgnoreCase("N")) {
				reajuste = 1.056;
			} else if (codigo.equalsIgnoreCase("C")) {
				reajuste = 1.035;
			}
			if (parcela == 1) {
				valor = (float) reajuste * iptu * 0.95;
			} else
				valor = (float) reajuste * iptu;
			if (codigo.equalsIgnoreCase("S"))
				soma += valor;
			if (valor > 5000)
				cont2++;
			if (aux == 1 || valor < iptuMenor)
				iptuMenor = valor;
			System.out.println("O valor do reajuste � de R$" + valor + " e o valor das parcelas � de R$"
					+ (float) valor / parcela);
		} while (!codigo.equalsIgnoreCase("X"));
		media = (float) soma / cont;
		System.out.println("A m�dia dos valores de IPTU reajustados da regi�o SUL/LESTE � de R$" + media);
		System.out
				.println("A quantidade de im�veis da cidade cujo valor do IPTU reajustado ultrapassar� R$5.000,00 � de "
						+ cont2);
		System.out.println("O MENOR valor de IPTU reajustado a ser cobrado na cidade � de R$" + iptuMenor);
		teclado.close();
	}
}