import java.util.Scanner;

public class C8EXEXTRA {
	public static void main(String[] args) {
		String nome, cargo, nomeMaior = "", cargoMaior = "";
		double salario, media, somasalario = 0, salarioMaior = 0;
		int idade, cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 3; aux++) {
			System.out.print("Informe o nome do funcion�rio: ");
			nome = teclado.nextLine();
			System.out.print("Informe o cargo do funcion�rio dentro da empresa: ");
			cargo = teclado.nextLine();
			System.out.print("Informe o sal�rio funcion�rio: ");
			salario = teclado.nextDouble();
			System.out.print("Informe a idade do funcion�rio: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			if (cargo.equalsIgnoreCase("s�nior") && salario > 10000 && idade > 50) {
				System.out.println(
						"O funcion�rio � s�nior, com o sal�rio maior que R$10 mil e sua idade � maior que 50!");
			} else {
				System.out.println(
						"O funcion�rio n�o � s�nior, ou n�o tem o sal�rio maior que R$10 mil, ou sua idade n�o � maior que 50.");
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
		System.out.println("A m�dia dos sal�rios dos funcion�rios com at� 18 anos � de " + media);
		System.out.println("O/A " + nomeMaior + " com o cargo de " + cargoMaior + " possui o maior sal�rio da empresa.");
		teclado.close();
	}
}
