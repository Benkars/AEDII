import java.util.Scanner;

public class C8EX10 {
	public static void main(String[] args) {
		String nome, nomeMaior = "";
		double preco, precoMaior = 0, total, soma = 0, media;
		int rep, quantidade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de insumos consumidos no projeto: ");
		rep = teclado.nextInt();
		teclado.nextLine();
		for (int aux = 1; aux <= rep; aux++) {
			System.out.print("Informe o insumo utilizado: ");
			nome = teclado.nextLine();
			System.out.print("Informe a quantidade de insumos utilizados: ");
			quantidade = teclado.nextInt();
			System.out.print("Informe o pre�o unit�rio do insumo: ");
			preco = teclado.nextDouble();
			if (aux == 1 || preco > precoMaior) {
				precoMaior = preco;
				nomeMaior = nome;
			}
			teclado.nextLine();
			total = preco * quantidade;
			soma += total;
		}
		media = soma / rep;
		System.out.println("O custo total � de R$" + soma + "\nA m�dia dos custos parciais � de R$" + media
				+ "\nO insumo de maior valor � o/a" + nomeMaior);
		teclado.close();
	}
}