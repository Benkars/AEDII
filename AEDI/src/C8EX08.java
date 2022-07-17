import java.util.Scanner;

public class C8EX08 {
	public static void main(String[] args) {
		double notaFinal, media;
		int faltas, cont1 = 0, cont2 = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			System.out.println("Informe o valor da nota final: ");
			notaFinal = teclado.nextDouble();
			if (notaFinal == -1)
				break;
			System.out.println("Informe o total de faltas do aluno: ");
			faltas = teclado.nextInt();
			if (faltas > 16) {
				cont2++;
			} else {
				if (notaFinal >= 65 && faltas < 17) {
					System.out.println("ALUNO APROVADO");
					soma += notaFinal;
					cont1++;
				} else {
					if (faltas > 16 || notaFinal < 65) {
						System.out.println("ALUNO REPROVADO");
					}
				}
			}
		}
		media = (float) soma / cont1;
		System.out.println("A média das notas dos alunos aprovados é " + media);
		System.out.println("A quantidade de alunos com mais de 16 faltas é " + cont2);
		teclado.close();
	}
}