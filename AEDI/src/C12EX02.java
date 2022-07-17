import java.util.Scanner;

public class C12EX02 {
	public static void main(String[] args) {
		int numero[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número para saber se ele é maior que 5 e menor que 10: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (numero[aux] > 5 && numero[aux] < 10) {
				System.out.println("O número " + numero[aux] + " é maior que 5 e menor que 10.");
			}
		}
		teclado.close();
	}
}
