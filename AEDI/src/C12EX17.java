import java.util.Scanner;

public class C12EX17 {
	public static void main(String[] args) {
		double numero[] = new double[10], numeroinverso[] = new double[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print("Informe um n�mero: ");
			numero[aux] = teclado.nextDouble();
		}
		System.out.print("A ordem dos n�meros de forma inversa � ");
		for (int aux = 0; aux < numero.length; aux++) 
			numeroinverso[aux] = numero[aux];
		for (int aux = 0; aux < numero.length; aux++)
		System.out.print(numeroinverso[9 - aux] + " ");
		teclado.close();
	}
}