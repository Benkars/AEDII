import java.util.Scanner;

public class C8EX17 {
	public static void main(String[] args) {
		int numero, tabuada;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro entre 1 e 9 para ver sua tabuada: ");
		numero = teclado.nextInt();
		System.out.println();
		System.out.println("Tabuada do número " + numero);
		for (int aux = 1; aux <= 10; aux++) {
			tabuada = aux * numero;
			System.out.println(aux + "  x  " + aux + "  =  " + tabuada);
		}
		teclado.close();
	}
}
