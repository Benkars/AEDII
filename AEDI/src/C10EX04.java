import java.util.Scanner;

public class C10EX04 {
	public static void main(String[] args) {
		String nome;
		double precoFinal, BDI, precoUnitario, custoParcial = 0, custoTotal = 0;
		int quantidade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a taxa BDI em %: ");
		BDI = teclado.nextDouble();
		do {
			teclado.nextLine();
			System.out.print("Informe o nome do material: ");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("FIM")) {
				System.out.print("Informe a quantidade do material: ");
				quantidade = teclado.nextInt();
				System.out.print("Informe o pre�o unit�rio do material: ");
				precoUnitario = teclado.nextDouble();
				custoParcial = precoUnitario * quantidade;
				custoTotal += custoParcial;
				System.out.println("O custo parcial em reais � de " + custoParcial);
			}
		} while (!nome.equalsIgnoreCase("FIM"));
		BDI = custoTotal * BDI / 100.0;
		precoFinal = custoTotal + BDI;
		System.out.println("O custo Total � de R$ " + custoTotal);
		System.out.println("O valor do BDI � de R$ " + BDI);
		System.out.println("O pre�o final � de R$ " + precoFinal);
		teclado.close();
	}
}
