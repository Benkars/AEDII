import java.util.Scanner;

public class C12EX04 {
	public static void main(String[] args) {
		int numero[] = new int[10];
		double quadrado;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um n�mero inteiro para saber seu valor ao quadrado: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Os valores ao quadrado s�o ");
		for (int aux = 0; aux < 10; aux++) {
			quadrado = Math.pow(numero[aux], 2);
			System.out.print(" " + quadrado + " ");
		}
		teclado.close();
	}
}
