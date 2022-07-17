import java.util.Scanner;

public class C8EX03 {
	public static void main(String[] args) {
		double notaFinal;
		int faltas, cont1 = 0, cont2 = 0;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			System.out.println("Informe o valor da nota final: ");
			notaFinal = teclado.nextDouble();
			if (notaFinal == -1)
				break;
			System.out.println("Informe o total de faltas do aluno: ");
			faltas = teclado.nextInt();
			if (notaFinal >= 65 && faltas < 17) {
				System.out.println("ALUNO APROVADO");
				cont1++;

			} else {
				System.out.println("ALUNO REPROVADO");
				cont2++;

			}
		}
		System.out.println("A quantidade de alunos aprovados é de: " + cont1);
		System.out.println("A quantidade de alunos reprovados é de: " + cont2);
		teclado.close();
	}
}