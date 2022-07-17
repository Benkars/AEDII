import java.util.Scanner;

public class C8EX21 {
	public static void main(String[] args) {
		int numero, cont1 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro maior que zero: ");
		numero = teclado.nextInt();
		for (int aux = 1; aux <= numero; aux++) {
			if (numero % aux == 0) {
				cont1++;
			}
		}
		if (cont1 == 2) {
			System.out.println("O número " + numero + " é primo !");
		} else {
			System.out.println("O número " + numero + " não é primo !");
		}
		teclado.close();
	}
}
