import java.util.Scanner;

public class C8EX22 {
	public static void main(String[] args) {
		int cont = 0;
		long soma = 0;
		double media, primeiro, segundo, terceiro, quarto;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1000; aux <= 9999; aux++) {
			primeiro = aux / 1000;
			segundo = aux / 100 % 10;
			terceiro = aux % 100 / 10;
			quarto = aux % 10;
			if (primeiro == quarto && segundo == terceiro) {
				soma += aux;
				cont++;
			}
		}
		media = (float) soma / cont;
		System.out.println("A m�dia dos n�meros que s�o pal�ndromos entre o intervalo de 1000 at� 9999 � de " + media);
		teclado.close();
	}
}
