import java.util.Scanner;

public class C12EX09 {
	public static void main(String[] args) {
		int numero[] = new int[10], soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			numero[aux] = teclado.nextInt();
			soma += numero[aux];
		}
		System.out.print("Os números divisores da soma de todos os números lidos são ");
		for (int aux = 0; aux < 10; aux++) {
			if (soma % numero[aux] == 0) {
				System.out.print(numero[aux] + " ");
			}
		}
		teclado.close();
	}
}
