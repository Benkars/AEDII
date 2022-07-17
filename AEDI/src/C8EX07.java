import java.util.Scanner;

public class C8EX07 {
	public static void main(String[] args) {
		int idade, cont1 = 0, cont2 = 0, soma1 = 0, soma2 = 0, soma3 = 0;
		String nome;
		double media;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 50; aux++) {
			System.out.print("Informe o nome do aluno: ");
			nome = teclado.nextLine();
			System.out.print("Informe a idade do aluno: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			if (idade <= 12) {
				soma1 += idade;
				cont1++;
			} else {
				if (idade > 30) {
					soma2 += idade;
					cont2++;
				} else
					soma3 += idade;
			}
		}
		media = (soma1 + soma2 + soma3) / 50.0;
		System.out.println("A quantidade de alunos até 12 anos é " + cont1);
		System.out.println("A quantidade de alunos acima de 30 anos é " + cont2);
		System.out.println("A média das idades é " + media);
		teclado.close();
	}
}
