import java.util.Scanner;

public class C12EX08 {
	public static void main(String[] args) {
		int numero[] = new int[20], soma[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 20; aux++) {
			System.out.print("Informe um n�mero inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("A soma do primeiro + d�cimo primeiro e segundo + d�cimo segundo ... d�cimo + vig�simo ");
		for (int aux = 0; aux < 10; aux++) {
			soma[aux] = numero[aux] + numero[aux + 10];
			System.out.print(soma[aux] + " ");
		}
		teclado.close();
	}
}
