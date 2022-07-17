import java.util.Scanner;
import java.util.Arrays;

public class C12EX13 {
	public static void main(String[] args) {
		String meses[] = new String[12];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 12; aux++) {
			System.out.print("Informe os 12 meses do ano: ");
			meses[aux] = teclado.nextLine();
		}
		Arrays.sort(meses);
		System.out.print("A ordenação dos meses em ordem alfabética é ");
		for (int aux = 0; aux < 12; aux++)
			System.out.print(meses[aux] + " ");
		teclado.close();
	}
}