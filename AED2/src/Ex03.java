import java.util.Scanner;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] numero = new int[5];
		int novoNumero;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 5; aux++) {
			System.out.print("Infore 5 números inteiros: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Informe o número a ser procurado: ");
		novoNumero = teclado.nextInt();
		Arrays.sort(numero);
		int posicao = Arrays.binarySearch(numero, novoNumero);
		if (posicao < 0)
			System.out.println("Número não encontrado");
		else
			System.out.println("Número encontrado na posição " + (posicao + 1));
		teclado.close();
	}
}