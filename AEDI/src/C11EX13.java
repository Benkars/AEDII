import java.util.Scanner;

public class C11EX13 {
	public static void main(String[] args) {
		double serie = 0, den, num, total;
		int numero, cont = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número de termos desejados: ");
		numero = teclado.nextInt();
		while (cont < numero) {
			cont++;
			num = cont * Math.pow((9 * cont + 1), 2 * cont);
			den = Math.pow(7, cont - 1);
			serie += num / den;
		}
		total = 71 + Math.cbrt(serie);
		System.out.println("O resultado da série matemática é de " + total);
		teclado.close();
	}
}
