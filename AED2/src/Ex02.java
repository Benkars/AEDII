import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número para ver a sua tabuada: ");
		numero = teclado.nextInt();
		for (int lux = 1; lux <= 10; lux++) {
			System.out.println(numero + " x " + lux + " = " + numero * lux);
		}
		teclado.close();
	}
}