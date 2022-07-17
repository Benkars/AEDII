import java.util.Scanner;

public class C9EX09 {
	public static void main(String[] args) {
		int termos;
		double num, den, serie = 0, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número de termos da série: ");
		termos = teclado.nextInt();
		for (int aux = 1; aux <= termos; aux++) {
			num = Math.pow(3, aux + 1);
			den = (aux + 9) * Math.sqrt(Math.pow(aux, 4));
			serie += (float) num / den;
		}
		resultado = 100 - Math.pow(serie, 3);
		System.out.println("O valor da série é de " + resultado);
		teclado.close();
	}
}