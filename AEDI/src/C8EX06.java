import java.util.Scanner;

public class C8EX06 {
	public static void main(String[] args) {
		int cont = 0, numero, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 10; aux++) {
			System.out.println("Informe um n�mero inteiro: ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O n�mero informado � par.");
			} else {
				System.out.println("O n�mero informado � �mpar.");
			}
			if (numero % 4.0 == 0) {
				soma += numero;
			}
			if (numero % 3.0 == 0) {
				cont++;
			}

		}
		System.out.println("A soma os n�meros divis�veis por 4 � " + soma
				+ "\nA quantidade de n�meros divis�veis por 3 � " + cont);
		teclado.close();
	}

}
