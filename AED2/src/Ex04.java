import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int[] sorteado = new int[6];
		int[] numero = new int[6];
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= sorteado.length - 1; aux++) {
			System.out.print("Informe o número sorteado da mega sena: ");
			sorteado[aux] = teclado.nextInt();
		}
		for (int lux = 0; lux <= numero.length - 1; lux++) {
			System.out.print("Informe os números que você jogou: ");
			numero[lux] = teclado.nextInt();
		}
		for (int pax = 0; pax <= numero.length - 1; pax++) {
			if (numero[pax] == sorteado[pax]) {
				cont++;
			}
		}
		System.out.println("A quantidade de acertos foi de " + cont);
		teclado.close();
	}
}