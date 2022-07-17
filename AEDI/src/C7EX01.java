import java.util.Scanner;

public class C7EX01 {
	public static void main(String[] args) {
		String nome;
		int acertos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do apostador: ");
		nome = teclado.nextLine();
		System.out.println("Informe a quantidade de acertos: ");
		acertos = teclado.nextInt();
		switch (acertos) {
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("O prêmio do(a) " + nome + " é de R$ 0,00");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("O prêmio do(a) " + nome + " é outro cartão de aposta.");
			break;
		case 11:
			System.out.println("O prêmio do(a) " + nome + " é é de R$ 100,00");
			break;
		case 12:
			System.out.println("O prêmio do(a) " + nome + " é de R$ 1.000,00");
			break;
		case 13:
			System.out.println("O prêmio do(a) " + nome + " é de R$ 50.000,00");
			break;
		}

		teclado.close();

	}

}
