import java.util.Scanner;

public class C8EX06 {
	public static void main(String[] args) {
		int cont = 0, numero, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 10; aux++) {
			System.out.println("Informe um número inteiro: ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O número informado é par.");
			} else {
				System.out.println("O número informado é ímpar.");
			}
			if (numero % 4.0 == 0) {
				soma += numero;
			}
			if (numero % 3.0 == 0) {
				cont++;
			}

		}
		System.out.println("A soma os números divisíveis por 4 é " + soma
				+ "\nA quantidade de números divisíveis por 3 é " + cont);
		teclado.close();
	}

}
