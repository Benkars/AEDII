import java.util.Scanner;

public class C13EX03 {
	public static void main(String[] args) {
		int valor, pos;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro qualquer entre 0 e 999999999: ");
		valor = teclado.nextInt();
		System.out.print("Informe a posição: ");
		pos = teclado.nextInt();
		System.out.println("O número referente a posição é o "+ numero(valor, pos));
		teclado.close();
	}

	static int numero(int numero, int posicao) {
		if (posicao == 1)
			return numero % 10;
		else if (posicao == 2)
			return numero % 100 / 10;
		else if (posicao == 3)
			return numero % 1000 / 100;
		else if (posicao == 4)
			return numero % 10000 / 1000;
		else if (posicao == 5)
			return numero % 100000 / 10000;
		else if (posicao == 6)
			return numero % 1000000 / 100000;
		else if (posicao == 7)
			return numero % 10000000 / 1000000;
		else if (posicao == 8)
			return numero % 100000000 / 10000000;
		else
			return numero % 1000000000 / 100000000;
	}
}