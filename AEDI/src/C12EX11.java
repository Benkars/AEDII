import java.util.Scanner;

public class C12EX11 {
	public static void main(String[] args) {
		int notas[] = new int[50], maiorNota;
		String nomes[] = new String[8], maiorNome = "";
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 50; aux++) {
			System.out.print("Informe o nome do aluno: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe a nota do aluno: ");
			notas[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		maiorNota = notas[0];
		for (int aux = 0; aux < 50; aux++) {
			if (notas[aux] > maiorNota) {
				maiorNota = notas[aux];
				maiorNome = nomes[aux];
			}
		}
		System.out.println("O aluno que que obteve a maior nota é " + maiorNome);
		teclado.close();
	}
}