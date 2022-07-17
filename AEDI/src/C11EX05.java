import java.util.Scanner;

public class C11EX05 {
	public static void main(String[] args) {
		String nome;
		int codigo, mensalidade = 0, cont = 0, cont2 = 0, soma = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe o nome do aluno: ");
			nome = teclado.nextLine();
			if (nome.equalsIgnoreCase("Fim")) {
				break;
			}
			System.out.print("Informe o código para a opção da língua (Inglês = 1, Francês = 2 e Espanhol = 3): ");
			codigo = teclado.nextInt();
			cont2++;
			switch (codigo) {
			case 1:
				mensalidade = 100;
				cont++;
				break;
			case 2:
				mensalidade = 150;
				break;
			case 3:
				mensalidade = 120;
				break;
			}
			soma += mensalidade;
			System.out.println("Para o aluno " + nome + ", o valor da mensalidade é de R$" + mensalidade);
			teclado.nextLine();
		} while (!nome.equalsIgnoreCase("FIM"));
		media = (float) soma / cont2;
		System.out.println("A quantidade de alunos matriculados nas turmas de Inglês é de " + cont);
		System.out.println("O valor da mensalidade média da escola é " + media);
		teclado.close();
	}
}
