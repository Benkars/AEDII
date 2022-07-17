import java.util.Scanner;

public class C12EX16 {
	public static void main(String[] args) {
		int numero[] = new int[10];
		double real, resultado;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print("Informe um número inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Informe um número real: ");
		real = teclado.nextDouble();
		System.out.print("Os números informados inicialmente multiplicados pelo número real são ");
		for (int aux = 0; aux < numero.length; aux++) {
			resultado = numero[aux] * real;
			System.out.print(resultado + ", ");
		}
		teclado.close();
	}
}