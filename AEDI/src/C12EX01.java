import java.util.Scanner;

public class C12EX01 {
	public static void main(String[] args) {
		int numero[] = new int[10], cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um n�mero inteiro que � divis�vel por 5 e 7: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (numero[aux] % 5 == 0 && numero[aux] % 7 == 0) {
				cont++;
			}
		}
		System.out.println("A quantidade de n�meros divis�veis por 5 e 7 s�o " + cont);
		teclado.close();
	}
}
