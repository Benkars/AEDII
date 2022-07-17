import java.util.Scanner;

public class C12EX21 {
	public static void main(String[] args) {
		int numero[] = new int[20];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print("Informe um númro inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Os números que foram informados na sequência ímpar e depois os da sequência par são: ");
		for (int aux = 0; aux < numero.length; aux += 2) {
			System.out.print(numero[aux] + " ");
		}
		for (int aux = 1; aux < numero.length; aux += 2) {
			System.out.print(numero[aux] + " ");
		}
		teclado.close();
	}
}