import java.util.Scanner;

public class C5ex3 {
	public static void main(String[] args) {
		double salario, numeroDeDependes, salarioLiquido, impostoDeRenda;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu sal�rio em reais: ");
		salario = teclado.nextDouble();
		System.out.print("Informe o n�mero de dependentes: ");
		numeroDeDependes = teclado.nextDouble();
		salarioLiquido = salario - (numeroDeDependes * 60);
		impostoDeRenda = salarioLiquido * 15 / 100;
		System.out.print("O valor a ser retido no imposto de renda � de R$" + impostoDeRenda);
		teclado.close();

	}

}
