import java.util.Scanner;

public class C8EX13 {
	public static void main(String[] args) {
		String cidade, cidadeMenor = "";
		long populacao, eleitores, homens, mulheres, cont = 0, contM = 0, menorPopulacao = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 858; aux++) {
			System.out.print("Informe a nome da cidade: ");
			cidade = teclado.nextLine();
			System.out.print("Informe a popula��o da cidade: ");
			populacao = teclado.nextLong();
			System.out.print("Informe a quantidade de eleitores da cidade: ");
			eleitores = teclado.nextLong();
			System.out.print("Informe a quantidade de homens da cidade: ");
			homens = teclado.nextLong();
			System.out.print("Informe a quantidade de mulheres da cidade: ");
			mulheres = teclado.nextLong();
			teclado.nextLine();
			if (mulheres > homens) {
				contM++;
			}
			if (homens + mulheres != populacao) {
				System.out.println("A soma de homens e de mulheres na cidade difere da popula��o total ta cidade!");
			} else {
				System.out.println("A soma de homens e de mulheres na cidade � igual a popula��o total ta cidade");
			}
			System.out.println("O percentual de eleitores da " + cidade + " � de " + eleitores * 100 / populacao + "%");
			if (populacao > 1000000) {
				cont++;
			}
			if (aux == 1 || populacao < menorPopulacao) {
				menorPopulacao = populacao;
				cidadeMenor = cidade;
			}

		}
		System.out.println("A quantidade de cidades que ultrapassam a marca de um milh�o de habitantes � de " + cont);
		System.out.println("A quantidade de cidades em que mulheres s�o a maior parte da popula��o s�o " + contM);
		System.out.println("O nome da cidade com menor populacao � " + cidadeMenor);
		teclado.close();
	}
}
