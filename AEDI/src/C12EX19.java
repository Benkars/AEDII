import java.util.Scanner;
import java.util.Arrays;

public class C12EX19 {
	public static void main(String[] args) {
		int bilhete[] = new int[100], sorteado, posSorte;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < bilhete.length; aux++) {
			System.out.print("Informe o n�mero do bilhete: ");
			bilhete[aux] = teclado.nextInt();
		}
		System.out.print("Informe o n�mero do bilhete sorteado: ");
		sorteado = teclado.nextInt();
		posSorte = Arrays.binarySearch(bilhete, sorteado);
		if (posSorte < 0)
			System.out.print("N�o foi encontrado o bilhete sorteado :'(.");
		else
			System.out.print("O bilhete sorteado est� na posi��o " + (posSorte + 1));
		teclado.close();
	}
}