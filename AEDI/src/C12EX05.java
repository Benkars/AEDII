import java.util.Scanner;

public class C12EX05 {
	public static void main(String[] args) {
		int numero[] = new int[10], maiorNumero = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (aux == 0 || numero[aux] > maiorNumero) {
				maiorNumero = numero[aux];
			}
		}
		System.out.println("O maior valor do vetor foi " + maiorNumero);
		teclado.close();
	}
}
