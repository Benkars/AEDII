import java.util.Scanner;

public class C4ex3 {
	public static void main(String[] args) {
		long quantidadeDePoluente1, quantidadeDePoluente2;
		double valor1, valor2, valor3;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a primeira quantidade de poluente emitido: ");
		quantidadeDePoluente1 = teclado.nextLong();
		System.out.print("Informe a segunda quantidade de poluente emitido: ");
		quantidadeDePoluente2 = teclado.nextLong();
		System.out.print("Informe o valor da primeira multa: ");
		valor1 = teclado.nextDouble();
		System.out.print("Informe o valor da segunda multa: ");
		valor2 = teclado.nextDouble();
		System.out.print("Informe o valor da terceira multa: ");
		valor3 = teclado.nextDouble();
		System.out.println("Quantidade de poluente emitido x Valor da multa");
		System.out.println("At� " + quantidadeDePoluente1 + " multa de R$" + valor1);
		System.out.println("Acima de " + quantidadeDePoluente1 + " at� " + quantidadeDePoluente2 + " multa de R$" + valor2);
		System.out.print("Acima de " + quantidadeDePoluente2 + " multa de R$" + valor3 + " por poluente emitido");
		teclado.close();
	}

}