import java.util.Scanner;

public class C8EX20 {
	public static void main(String[] args) {
		String situacao = "";
		double altura, imc;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		altura = teclado.nextDouble();
		System.out.println("Peso     IMC     Situação Corpórea");
		System.out.println();
		for (int peso = 60; peso <= 100; peso++) {
			imc = peso / Math.pow(altura, 2);
			if (imc < 20) {
				situacao = "Abaixo do peso";
			} else {
				if (imc > 20 && imc <= 25) {
					situacao = "Peso ideal";
				} else {
					situacao = "Acima do peso";
				}
			}
			System.out.printf("%d      %1.2f     %s", peso, imc, situacao);
			System.out.println();
		}
		teclado.close();
	}
}
