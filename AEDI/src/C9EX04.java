import java.util.Scanner;

public class C9EX04 {
	public static void main(String[] args) {
		int termos;
		double serie = 0, den, num, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o n�mero de termos necess�rios: ");
		termos = teclado.nextInt();
		for (int aux = 1; aux <= termos; aux++) {
			num = ((aux * 4) - 3) * ((aux * 4) - 2);
			den = aux * 4 * ((aux * 4) - 1);
			serie += (float) num / den;
		}
		resultado = Math.sqrt(serie);
		System.out.println("O resultado da s�rie � de " + resultado);
		teclado.close();
	}
}
