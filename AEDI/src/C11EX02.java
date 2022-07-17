import java.util.Scanner;

public class C11EX02 {
	public static void main(String[] args) {
		int cont = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		String nome, menorNome = "", classificacao;
		double media, valor, soma = 0, soma2 = 0, MenorValor = 0;
		Scanner teclado = new Scanner(System.in);
		while (cont4 < 538) {
			cont4++;
			System.out.print("Informe o seu nome: ");
			nome = teclado.nextLine();
			System.out.print("Informe o seu valor aplicado em reais: ");
			valor = teclado.nextDouble();
			teclado.nextLine();
			soma2 += valor;
			if (valor < 1000) {
				classificacao = "Bronze";
				cont++;
				soma += valor;
			} else {
				if (valor > 1000 && valor < 5000) {
					classificacao = "Prata";
					cont2++;
				} else {
					classificacao = "Ouro";
					cont3++;
				}
			}
			if (cont4 == 1 || valor < MenorValor) {
				MenorValor = valor;
				menorNome = nome;
			}
			System.out.println("O cliente " + nome + " possui a classificação " + classificacao);
		}
		media = (float) soma / cont;
		System.out.println(
				"O houve " + cont + " de bronze\nO houve " + cont2 + " de prata\nO houve " + cont3 + " de Ouro");
		System.out.println("A média dos valores aplicados dos clientes bronze é de " + media);
		System.out.println("O volume total de aplicações é de " + soma2);
		System.out.println("O nome do cliente que fez a menor aplicação é " + menorNome);
		teclado.close();
	}
}
