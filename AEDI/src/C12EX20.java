import java.util.Scanner;

public class C12EX20 {
	public static void main(String[] args) {
		int numero[] = new int[10], soma = 0, cont = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print("Informe um n�mero inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Os n�meros maiores que o �ltimo n�mero informado s�o ");
		for (int aux = 0; aux < numero.length; aux++)
			if (numero[9] < numero[aux]) {
				System.out.print(numero[aux] + " ");
				cont++;
				soma += numero[aux];
			}
		media = (float) soma / cont;
		System.out.println();
		System.out.print("A m�dia dos n�meros maiores que o �ltimo n�mero informado � " + media);
		teclado.close();
	}
}