import java.util.Scanner;

public class C7EX04 {
	public static void main(String[] args) {
		String equipe;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a equipe brasileira de futebol: ");
		equipe = teclado.nextLine();
		switch (equipe) {
		case "Am�rica":
		case "Atl�tico":
		case "Cruzeiro":
		case "Villa Nova":
			System.out.println("O time de futebol � pertencente ao estado de Minas Gerais.");
			break;
		case "Botafogo":
		case "Flamengo":
		case "Fluminense":
		case "Vasco":
			System.out.println("O time de futebol � pertencente ao estado do Rio de Janeiro.");
			break;
		case "Gr�mio":
		case "Internacional":
		case "Juventude":
			System.out.println("O time de futebol � pertencente ao estado do Rio Grande do Sul.");
			break;
		case "N�utico":
		case "Santa Cruz":
		case "Sport":
			System.out.println("O time de futebol � pertencente ao estado de Pernambuco.");
			break;

		}

		teclado.close();

	}

}
