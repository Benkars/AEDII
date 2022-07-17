import java.util.Scanner;
import java.util.Arrays;

public class C12EX24 {
	public static void main(String[] args) {
		int pontos[] = new int[20], tempPontos, pos;
		String nomes[] = new String[20], tempNomes, pesquisa;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < pontos.length; aux++) {
			System.out.print("Informe o nome da equipe: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe a quantidade de pontos da equipe: ");
			pontos[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux < 4; aux++)
			for (int x = 0; x < 4; x++) {
				if (pontos[x] < pontos[1 + x]) {
					tempPontos = pontos[x];
					pontos[x] = pontos[x + 1];
					pontos[x + 1] = tempPontos;
					tempNomes = nomes[x];
					nomes[x] = nomes[x + 1];
					nomes[x + 1] = tempNomes;
				}
			}
		System.out.print("Informe o time a ser pesquisado: ");
		pesquisa = teclado.nextLine();
		pos = Arrays.binarySearch(nomes, pesquisa);
		if (pos > 0 && pos < 4) {
			System.out.print("A posição do time na tabela foi " + (pos + 1)
					+ " e sua situação foi classificad0 para a Copa Libertadores");
		} else if (pos > 3 && pos < 12) {
			System.out.print("A posição do time na tabela foi " + (pos + 1)
					+ " e sua situação foi classificado para a Copa Sul-americana");
		} else if (pos > 16 && pos < 20) {
			System.out.print(
					"A posição do time na tabela foi " + (pos + 1) + " e sua situação do seu foi na tabela é rebaixado");
		} else
			System.out.println("O time não foi ncontrado");
		teclado.close();
	}
}