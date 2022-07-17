import java.util.Scanner;

public class C12EX10 {
	public static void main(String[] args) {
		int notas[] = new int[50], soma = 0;
		String nomes[] = new String[50];
		double media = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 50; aux++) {
			System.out.print("Informe o nome do aluno: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe a nota do aluno: ");
			notas[aux] = teclado.nextInt();
			soma += notas[aux];
			teclado.nextLine();
		}
		System.out.println("Os alunos que ficaram acima da média são: ");
		media = soma / 50.0;
		for (int aux = 0; aux < 50; aux++) {
			if (notas[aux] > media)
				System.out.println(nomes[aux]);
		}
		teclado.close();
	}
}