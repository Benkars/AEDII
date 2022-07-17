import java.util.Scanner;

public class C9EX03 {
	public static void main(String[] args) {
		int termos, cont = 0;
		double serie = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de termos desejada: ");
		termos = teclado.nextInt();
		for (int aux = 1; aux <= termos; aux++) {
			cont++;
			serie += (1 + Math.sqrt(4 * cont)) / (3 * cont);
		}
		System.out.println("O o valor da série corresponde a " + serie);
		teclado.close();
	}
}
