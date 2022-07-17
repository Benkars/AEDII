import java.util.Scanner;

public class C12EX06 {
	public static void main(String[] args) {
		String meses[] = new String[12];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 12; aux++) {
			System.out.print("Informe os 12 meses do ano em ordem cronológica: ");
			meses[aux] = teclado.nextLine();
		}
		System.out.print("A ordem inversa dos meses é ");
		for (int aux = meses.length - 1; aux >= 0; aux--) {
			System.out.print(meses[aux] + " ");
		}
		teclado.close();
	}
}
