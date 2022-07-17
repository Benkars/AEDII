import java.util.Scanner;
import java.util.Arrays;

public class E01772B {
	public static void main(String[] args) {
		// BERNARDO CABRAL BERTOLDI TRIGUEIRO
		String nomes[] = new String[10], tempNomes, maiores[] = new String[5];
		double valor[] = new double[10], tempValor;
		int posicao;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < nomes.length; aux++) {
			System.out.print("Informe o seu nome: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe o valor aplicado: ");
			valor[aux] = teclado.nextDouble();
			teclado.nextLine();
		}
		for (int aux = 0; aux < valor.length - 1; aux++)
			for (int x = 0; x < valor.length - 1; x++) {
				if (valor[x] < valor[x + 1]) {
					tempValor = valor[x];
					valor[x] = valor[x + 1];
					valor[x + 1] = tempValor;
					tempNomes = nomes[x];
					nomes[x] = nomes[x + 1];
					nomes[x + 1] = tempNomes;
				}
			}
		System.out.println("Os clientes que fizeram as maiores 10 aplicações são: ");
		for (int aux = 0; aux < 5; aux++) {
			maiores[aux] = nomes[aux];
			System.out.println(maiores[aux]);
		}
		System.out.print("Digite um nome a procurar: ");
		String nome = teclado.nextLine();
		posicao = Arrays.binarySearch(maiores, nome);
		if (posicao < 0)
			System.out.print("NÃO ENCONTRADO NA LISTA DOS 10 MAIS!");
		else if (posicao > 0)
			System.out.print("Nome achado na posição " + (posicao + 1));
		teclado.close();
	}
}