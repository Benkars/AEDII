import java.util.Scanner;

public class C12EX07 {
	public static void main(String[] args) {
		int notas[] = new int[50];
		String nomes[] = new String[50], conceito;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 5; aux++) {
			System.out.print("Informe o nome do aluno: ");
			nomes[aux] = teclado.nextLine();
			System.out.print("Informe a nota do aluno: ");
			notas[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux < 5; aux++) {
			if (notas[aux] <= 30) {
				conceito = "D";
			} else if (notas[aux] <= 60) {
				conceito = "C";
			} else if (notas[aux] <= 80) {
				conceito = "B";
			} else
				conceito = "A";
			System.out.println("O aluno " + nomes[aux] + " teve seu conceito igual a " + conceito);
		}
		teclado.close();
	}
}
