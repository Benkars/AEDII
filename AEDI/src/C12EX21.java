import java.util.Scanner;

public class C12EX21 {
	public static void main(String[] args) {
		int numero[] = new int[20];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print("Informe um n�mro inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Os n�meros que foram informados na sequ�ncia �mpar e depois os da sequ�ncia par s�o: ");
		for (int aux = 0; aux < numero.length; aux += 2) {
			System.out.print(numero[aux] + " ");
		}
		for (int aux = 1; aux < numero.length; aux += 2) {
			System.out.print(numero[aux] + " ");
		}
		teclado.close();
	}
}