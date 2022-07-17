import java.util.Scanner;

public class C11EX12 {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro entre 1 e 9: ");
		numero = teclado.nextInt();
		if (numero < 1 || numero > 9) {
			System.out.print("Informe um número inteiro entre 1 e 9 !!! : ");
			numero = teclado.nextInt();
		}
		for (int aux = 1; aux <= numero; aux++) {
			for (int lux = 1; lux <= aux; lux++) {
				System.out.print(lux + " ");
			}
			for (int vici = aux; vici >= 1; vici--) {
				System.out.print(vici + " ");
			}
			System.out.println();
		}
		teclado.close();
	}
}