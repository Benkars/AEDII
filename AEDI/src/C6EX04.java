import java.util.Scanner;

public class C6EX04 {
	public static void main(String[] args) {
		String nome;
		double altura, peso, imc;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe o seu peso em quilos: ");
		peso = teclado.nextDouble();
		System.out.print("Informe a sua altura em metros: ");
		altura = teclado.nextDouble();
		imc = peso / Math.pow(altura, 2);
		if (imc < 18)
			System.out.printf("%s est� desnutrida.", nome);
		else {
			if (imc < 20 && imc >= 18 )
				System.out.printf("%s est� abaixo de peso.", nome);
			else {
				if (imc >= 20 && imc <= 25)
					System.out.printf("%s est� no peso ideal.", nome);
				else {
					if (imc > 25 && imc < 27)
						System.out.printf("%s est� acima do peso.", nome);
					else {
						System.out.printf("%s est� obsesa.", nome);
					}
				}

			}

		}

		teclado.close();

	}

}
