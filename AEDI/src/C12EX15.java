import java.util.Scanner;

public class C12EX15 {
	public static void main(String[] args) {
		int numero[] = new int[10], soma = 0, cont = 0;
		double media = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (numero[aux] % 2 == 0) {
				soma += numero[aux];
				cont++;
				System.out.print(numero[aux] + " ");
			}
		}
		media = (float) soma / cont;
		System.out.print(" \nMédia igual a " + media);
		teclado.close();
	}
}