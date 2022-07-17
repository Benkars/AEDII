import java.util.Scanner;

public class C10EX02 {
	public static void main(String[] args) {
		double valor, media, soma = 0;
		int cont = 0, cont2 = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o valor do serviço prestado em reais: ");
			valor = teclado.nextDouble();
			if (valor != 0) {
				cont++;
				soma += valor;
				if (valor > 1000) {
					cont2++;
				}
			}
		} while (valor != 0);
		media = (float) soma / cont;
		System.out.println("A média dos valores recebidos é de R$ " + media);
		System.out.println("O valor total recebido é de R$ " + soma);
		System.out.println("A quantidade de valores recebidos acima de R$1000,00 é " + cont2);
		teclado.close();
	}
}
