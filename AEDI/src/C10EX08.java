import java.util.Scanner;

public class C10EX08 {
	public static void main(String[] args) {
		String cidade, cidadeMenor = "";
		long populacao, eleitores, mulheres, homens, soma, cont = 0, populacaoTotal = 0, cont2 = 0, populacaoMenor = 0,
				eleitoresTotal = 0, homensTotal = 0;
		double mediaHomens, eleitoresPerc;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o nome da cidade: ");
			cidade = teclado.nextLine();
			System.out.print("Informe a popula��o da cidade: ");
			populacao = teclado.nextLong();
			System.out.print("Informe o n�mero de eleitores da cidade: ");
			eleitores = teclado.nextLong();
			System.out.print("Informe a quantidade de homens da cidade: ");
			homens = teclado.nextLong();
			System.out.print("Informe a quantidade de mulheres da cidade: ");
			mulheres = teclado.nextLong();
			teclado.nextLine();
			soma = homens + mulheres;
			cont++;
			populacaoTotal += populacao;
			homensTotal += homens;
			eleitoresTotal += eleitores;
			mediaHomens = (float) homensTotal / cont;
			if (cont == 1 || populacao < populacaoMenor) {
				populacaoMenor = populacao;
				cidadeMenor = cidade;
			}
			if (soma != populacao) {
				System.out
						.println("Houve um problema, a soma de homens e mulheres n�o � igual a popula��o da cidade !");
			}
			if (mulheres > homens) {
				cont2++;
			}
		} while (!cidade.equalsIgnoreCase("Zimbabue de Minas"));
		eleitoresPerc = (float) eleitoresTotal * 100 / populacaoTotal;
		System.out.println("A quantidade total de cidades do estado � de " + cont);
		System.out.println("A popul��o total do estado � de " + populacaoTotal);
		System.out.println("O percentual de eleitores no estado � " + eleitoresPerc);
		System.out.println("A quantidade de cidades cuja popula��o tem mais mulheres � de " + cont2);
		System.out.println("A m�dia de homens no estado � de " + mediaHomens);
		System.out.println("O nome da cidade de menor popula��o do estado � " + cidadeMenor);
		teclado.close();
	}
}
