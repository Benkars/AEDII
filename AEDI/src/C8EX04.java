import java.util.Scanner;

public class C8EX04 {
	public static void main(String[] args) {
		int idade, cont1 = 0, cont2 = 0;
		String nome;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			System.out.println("Informe o nome do estudante: ");
			nome = teclado.nextLine();
			System.out.println("Informe a idade do estudante: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			if (idade > 18) {
				cont1++;
			}

			cont2 = 50 - cont1;

		}
		System.out.println("A quantidade de alunos com idade até dezoito anos é de " + cont2);
		System.out.println("A quantidade de alunos com idade acima dezoito anos é de " + cont1);

		teclado.close();
	}

}
