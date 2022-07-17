import java.util.Scanner;

public class C12EX14 {
	public static void main(String[] args) {
		String nomes[] = new String[10], tempNomes, estado[] = new String[10], tempEstado;
		int populacao[] = new int[10], tempPopulacao;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe a nome do estado: ");
			estado[aux] = teclado.nextLine();
			System.out.print("Informe a nome da cidade: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe a população da cidade: ");
			populacao[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux < 9; aux++)
			for (int x = 0; x < 9; x++) {
				if (populacao[x] < populacao[x + 1]) {
					tempPopulacao = populacao[x];
					populacao[x] = populacao[x + 1];
					populacao[x + 1] = tempPopulacao;
					tempNomes = nomes[x];
					nomes[x] = nomes[x + 1];
					nomes[x + 1] = tempNomes;
					tempEstado = estado[x];
					estado[x] = estado[x + 1];
					estado[x + 1] = tempEstado;
				}
			}
		System.out.print("A ordem do nome e estado das 10 maiores cidades de forma decrescente pela sua população é ");
		for (int aux = 0; aux < 5; aux++)
			System.out.print(nomes[aux] + " " + estado[aux]);
		teclado.close();
	}
}