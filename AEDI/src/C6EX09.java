import java.util.Scanner;

public class C6EX09 {
	public static void main(String[] args) {
		char sexo;
		Double altura, resultado = 0.0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a sua altura em metros: ");
		altura = teclado.nextDouble();
		System.out.print("Informe o seu sexo, em que M para masculino e F para feminino: ");
		sexo = teclado.next(".").charAt(0);
		if (sexo == 'M' || sexo == 'm')
			resultado = 72.7 * altura - 58;
		else {
			if (sexo == 'F' || sexo == 'f')
				resultado = 62.1 * altura - 44.7;
		}
		System.out.printf("O peso Ideal em quilos é de %1.3f", resultado);

		teclado.close();
	}
}