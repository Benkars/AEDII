import java.util.Scanner;

public class C12EX03 {
	public static void main(String[] args) {
		int numero[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro para a quantidade que é divisível por 34: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (34 % numero[aux] == 0) {
				System.out.println("O número " + numero[aux] + " é divisor de 34.");
			}
		}
		teclado.close();
	}
}
