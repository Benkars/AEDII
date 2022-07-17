import java.util.Scanner;

public class C11EX04 {
	public static void main(String[] args) {
		String nome, nomeVelho = "", sexo;
		int idade, pontos, cont = 0, idadeVelho = 0, somaIdade = 0, cont2 = 0, cont3 = 0;
		double multa, mediaIdade, soma = 0, perctHomens;
		Scanner teclado = new Scanner(System.in);
		while (cont < 230) {
			cont++;
			System.out.print("Informe seu nome: ");
			nome = teclado.nextLine();
			System.out.print("Informe a sua idade: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe seu nome sexo (M para masculino e F para feminino): ");
			sexo = teclado.nextLine();
			System.out.print("Informe os pontos perdidos na carteira: ");
			pontos = teclado.nextInt();
			System.out.print("Informe o valor da multa em reais: ");
			multa = teclado.nextDouble();
			teclado.nextLine();
			somaIdade += idade;
			soma += multa;
			if (sexo.equalsIgnoreCase("M")) {
				cont2++;
			} else {
				if (pontos == 7) {
					cont3++;
				}
			}
			if (cont == 1 || idade > idadeVelho) {
				idadeVelho = idade;
				nomeVelho = nome;
			}
		}
		perctHomens = (float) cont2 * 100 / cont;
		mediaIdade = (float) somaIdade / cont;
		System.out.println("A idade média dos condutores é de " + mediaIdade);
		System.out.println("O valor total das multas aplicadas é de " + soma);
		System.out.println("O percentual de homens multados é de " + perctHomens);
		System.out.println("A quantidade de mulheres que perderam 7 pontos na carteira é de " + cont3);
		System.out.println("O condutor " + nomeVelho + ", com idade de " + idadeVelho + " é a pessoa mais velha");
		teclado.close();
	}
}
