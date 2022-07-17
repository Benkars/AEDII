import java.util.Scanner;
import java.util.Arrays;

public class C12EX18 {
	public static void main(String[] args) {
		String nomes[] = new String[10];
		int posicao2;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < nomes.length; aux++) {
			System.out.print("Informe o nome da pessoa que está na fila: ");
			nomes[aux] = teclado.nextLine();
		}
		System.out.print("Digite um nome a procurar: ");
		String nome = teclado.nextLine();
		posicao2 = Arrays.binarySearch(nomes, nome);
		if (posicao2 < 0) {
			System.out.println("A pessoa de nome " + nome + " não está na fila");
		} else
			System.out.println("A pessoa " + nome + " está na posição " + (posicao2 + 1));
		teclado.close();
	}
}