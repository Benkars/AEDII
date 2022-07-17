import java.util.Scanner;

public class C12EX12 {
	public static void main(String[] args) {
		int notas[] = new int[8], maiorNota;
		String nomes[] = new String[8];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 8; aux++) {
			System.out.print("Informe o nome do aluno: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe a nota do aluno: ");
			notas[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		maiorNota = notas[0];
		System.out.print("O aluno/alunos que obtiveram a maior nota é ");
		for (int aux = 0; aux < 8; aux++) {
			if (notas[aux] > maiorNota) {
				maiorNota = notas[aux];
			}
		}
		for (int aux = 0; aux < 8; aux++) {
			if (notas[aux] == maiorNota) {
				System.out.print(nomes[aux] + " ");
			}
		}
		teclado.close();
	}
}