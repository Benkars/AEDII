import java.util.Scanner;

public class C8EX15 {
	public static void main(String[] args) {
		double media;
		int cont = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1000; aux <= 2000; aux++) {
			if (aux % 2 != 0) {
				cont++;
				soma += aux;
			}
		}
		media = (float) soma / cont;
		System.out.println(media);
		teclado.close();
	}
}
