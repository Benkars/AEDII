import java.util.Scanner;

public class C8EX02 {
	public static void main(String[] args) {
		double notaFinal;
		int faltas;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			System.out.println("Informe o valor da nota final: ");
			notaFinal = teclado.nextDouble();
			if (notaFinal == -1)
				break;
			System.out.println("Informe o total de faltas do aluno: ");
			faltas = teclado.nextInt();
			if (notaFinal > 65 && faltas < 16)
				System.out.println("O aluno foi aprovado");
			else {
				System.out.println("O aluno foi reprovado");
			}
		}
		teclado.close();
	}
}