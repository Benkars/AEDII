import java.util.Scanner;

public class C8EX23 {
	public static void main(String[] args) {
		double resultado = 0, soma = 0, serie;
		Scanner teclado = new Scanner(System.in);
		for (int aux = -1; aux <= 99; aux += 2) {
			serie = (Math.pow(2, aux));
			soma += serie;
		}
		resultado = soma / 3;
		System.out.println("O valor da série é de "+resultado);
		teclado.close();
	}
}
