import java.util.Scanner;

public class C6EX03 {
	public static void main(String[] args) {
		double salario, vendasMensais;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe as vendas mensais realizadas pelo vendedor: ");
		vendasMensais = teclado.nextDouble();
		if (vendasMensais <= 1000)
			salario = 240;
		else {
			if (vendasMensais > 1000 && vendasMensais <= 10000)
				salario = 240 + vendasMensais * 0.1;
			else
				salario = 1240;
		}
		System.out.printf("O salário do vendedor em reais é de %1.2f", salario);
		teclado.close();

	}

}
