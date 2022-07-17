import java.util.Scanner;

public class C8EXEXTRA {
	public static void main(String[] args) {
		String nome, cargo, nomeMaior = "", cargoMaior = "";
		double salario, media, somasalario = 0, salarioMaior = 0;
		int idade, cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 3; aux++) {
			System.out.print("Informe o nome do funcionário: ");
			nome = teclado.nextLine();
			System.out.print("Informe o cargo do funcionário dentro da empresa: ");
			cargo = teclado.nextLine();
			System.out.print("Informe o salário funcionário: ");
			salario = teclado.nextDouble();
			System.out.print("Informe a idade do funcionário: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			if (cargo.equalsIgnoreCase("sênior") && salario > 10000 && idade > 50) {
				System.out.println(
						"O funcionário é sênior, com o salário maior que R$10 mil e sua idade é maior que 50!");
			} else {
				System.out.println(
						"O funcionário não é sênior, ou não tem o salário maior que R$10 mil, ou sua idade não é maior que 50.");
			}
			if (idade <= 18) {
				somasalario += salario;
				cont++;
			}
			if (aux == 1 || salario > salarioMaior){
				salarioMaior = salario;
				nomeMaior = nome;
				cargoMaior = cargo;
			}
		}
		media = (float) somasalario / cont;
		System.out.println("A média dos salários dos funcionários com até 18 anos é de " + media);
		System.out.println("O/A " + nomeMaior + " com o cargo de " + cargoMaior + " possui o maior salário da empresa.");
		teclado.close();
	}
}
