import java.util.Scanner;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] numero = new int[5];
		int novoNumero;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 5; aux++) {
			System.out.print("Infore 5 n�meros inteiros: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Informe o n�mero a ser procurado: ");
		novoNumero = teclado.nextInt();
		Arrays.sort(numero);
		int posicao = Arrays.binarySearch(numero, novoNumero);
		if (posicao < 0)
			System.out.println("N�mero n�o encontrado");
		else
			System.out.println("N�mero encontrado na posi��o " + (posicao + 1));
		teclado.close();
	}
}