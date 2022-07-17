import java.util.Scanner;

public class C12EX20 {
	public static void main(String[] args) {
		int numero[] = new int[10], soma = 0, cont = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print("Informe um número inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Os números maiores que o último número informado são ");
		for (int aux = 0; aux < numero.length; aux++)
			if (numero[9] < numero[aux]) {
				System.out.print(numero[aux] + " ");
				cont++;
				soma += numero[aux];
			}
		media = (float) soma / cont;
		System.out.println();
		System.out.print("A média dos números maiores que o último número informado é " + media);
		teclado.close();
	}
}