import java.util.Scanner;

public class C11EX01 {
	public static void main(String[] args) {
		double funcao = 0, media, soma = 0;
		int cont = 0, x = -1, rep, xo = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor para as repetições: ");
		rep = teclado.nextInt();
		do {
			cont++;
			x += 2;
			xo = x;
			if (x > rep) {
				break;
			}
			funcao = (float) Math.pow(xo, 2) + (4 * xo - 2) / 5.0;
			System.out.println("O valor da equação para x = " + x + " é igual a " + funcao);
			soma += funcao;
		} while (cont < rep);
		media = (float) soma / (cont - 1);
		System.out.println("O valor da média é de " + media);
		teclado.close();
	}
}
