import java.util.Scanner;

public class C5ex10 {
	public static void main(String[] args) {
		int numero, resto1, resto2, resto3, resto4, resto5;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número inteiro de 5 dígitos: ");
		numero = teclado.nextInt();
		resto1 = numero / 10000;
		resto2 = numero / 1000 % 10;
		resto3 = numero / 100 % 10;
		resto4 = numero / 10 % 10;
		resto5 = numero % 10;
		System.out.println("Impressão=");
		System.out.println(resto1);
		System.out.println(resto2);
		System.out.println(resto3);
		System.out.println(resto4);
		System.out.println(resto5);
		teclado.close();

	}

}