import java.util.Scanner;

public class C12EX03 {
	public static void main(String[] args) {
		int numero[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um n�mero inteiro para a quantidade que � divis�vel por 34: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (34 % numero[aux] == 0) {
				System.out.println("O n�mero " + numero[aux] + " � divisor de 34.");
			}
		}
		teclado.close();
	}
}
