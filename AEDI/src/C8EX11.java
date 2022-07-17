import java.util.Scanner;

public class C8EX11 {
	public static void main(String[] args) {
		String nome, nomeMaior = "", sexo, estadoCivil, olhos, cabelo;
		double salario, salarioMaior = 0, salarioMenor = 0, diferenca = 0, salarioMaiorGeral = 0;
		int escolaridade, idade, cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 3; aux++) {
			System.out.print("Informe o nome do usuário: ");
			nome = teclado.nextLine();
			System.out.print("Informe a idade do usuário: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe o sexo do usuário, em que M para masculino ou F para feminino: ");
			sexo = teclado.nextLine();
			System.out.print(
					"Informe o estado civil do usuário, em que C para casado, S para solteiro ou O para outros: ");
			estadoCivil = teclado.nextLine();
			System.out.print(
					"Informe a cor dos olhos do usuário, em que A para azul, C para castanhos, P para preto ou O para outros: ");
			olhos = teclado.nextLine();
			System.out.print(
					"Informe a cor dos cabelos do usuário, em que L para loiro, P para preto, C para castanhos ou R para ruivos: ");
			cabelo = teclado.nextLine();
			System.out.print("Informe o salário do usuário em reais: ");
			salario = teclado.nextDouble();
			System.out.println(
					"Informe o grau de escolaridade do usuário, em que 1 para analfabeto, 2 para ensino fundamental, 3 para ensino médio ou 4 para superior: ");
			escolaridade = teclado.nextInt();
			if (aux == 1 || salario > salarioMaiorGeral) {
				salarioMaiorGeral = salario;
				nomeMaior = nome;
			}
			if (aux == 1 || cabelo.equalsIgnoreCase("L") && olhos.equalsIgnoreCase("A")
					&& estadoCivil.equalsIgnoreCase("S") && sexo.equalsIgnoreCase("F") && idade >= 18 && idade <= 25
					&& salario > 10000 && escolaridade == 4) {
				cont++;
			}
			if (aux == 1 || sexo.equalsIgnoreCase("M") && salario > salarioMaior) {
				salarioMaior = salario;
			}
			if (aux == 1 || sexo.equalsIgnoreCase("M") && salario < salarioMenor) {
				salarioMenor = salario;
			}
			teclado.nextLine();
		}
		diferenca = salarioMaior - salarioMenor;
		System.out.println(
				"A quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo é de "
						+ cont + "\nO nome da pessoa com maior salário é " + nomeMaior
						+ "\nA Diferença entre o maior e menor salário dos homens é de " + diferenca);
		teclado.close();
	}
}
