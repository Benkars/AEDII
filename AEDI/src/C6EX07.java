import java.util.Scanner;

public class C6EX07 {
	public static void main(String[] args) {
		double salario, plLiquido;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o salário em reais: ");
		salario = teclado.nextDouble();
		if (salario <= 300) {
			plLiquido = -(salario * 0.7 + 500) * 0.25 + (salario * 0.7 + 500);
		} else {
			if (salario >= 300 && salario <= 1000) {
				plLiquido = -(salario * 0.5 + 200) * 0.25 + (salario * 0.5 + 200);
			} else {
				plLiquido = -(salario * 0.3) * 0.25 + (salario * 0.3);
			}
		}
		System.out.printf("PL Líquido é igual a %1.2f", plLiquido);
		teclado.close();
	}
}