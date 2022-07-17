import java.util.Scanner;

public class C9EX05 {
	public static void main(String[] args) {
		int rep;
		double num, den, serie = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe quantos são os termos desejados: ");
		rep = teclado.nextInt();
		for (int aux = 1; aux <= rep; aux++) {
			num = aux*2 -2 + aux*3;
			den = 7*aux - aux+1;
			serie += 5 * (float) num / den;
		}
		System.out.println("O valor da série é de " + serie);
		teclado.close();
	}
}
