import java.util.Scanner;

public class C6EX01 {
	public static void main(String[] args) {
		double valorX, valorFuncao;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor da variável X: ");
		valorX = teclado.nextDouble();
		if (valorX == 4) {
			valorFuncao = 0;
		} else {
			if (valorX < 4) {
				valorFuncao = (5 * valorX + 3) / Math.sqrt(16 - Math.pow(valorX, 2));
			} else
				valorFuncao = (5 * valorX + 3) / Math.sqrt(-16 + Math.pow(valorX, 2));
		}

		System.out.println("O valor da função F(x) é de " + valorFuncao);
		teclado.close();

	}

}
