import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int numero, numero2, cont = 0, soma = 0, maior = 0, menor = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		menor = numero;
		System.out.print("Informe o segundo número: ");
		numero2 = teclado.nextInt();
		maior = numero2;
		if (numero2 < numero) {
			maior = numero;
			menor = numero2;
		}
		while (maior != soma) {
			cont++;
			soma = cont + menor + 1;
			System.out.println(soma - 1);
		}
		teclado.close();
	}
}