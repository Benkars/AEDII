import java.util.Scanner;

public class C6EX05 {
	public static void main(String[] args) {
		int numero, resto1, resto2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		numero = teclado.nextInt();
		resto1 = numero % 5;
		resto2 = numero % 7;
		if (resto1 == 0 && resto2 == 0)
			System.out.printf("%d é divisível simultaneamente por 5 e 7.",numero);
		else {
			System.out.printf("%d não é divisível simultaneamente por 5 e 7.",numero);
		}

		teclado.close();
	}

}
