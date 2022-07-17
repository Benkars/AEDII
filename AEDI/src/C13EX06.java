import java.util.Scanner;

public class C13EX06 {
	public static void main(String[] args) {
		String nome, nomefamilia;
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= 5; aux++) {
			System.out.println("Informe o nome de uma família: ");
			nome = teclado.nextLine();
			String[] sobrenome = nome.split(" ");
			nomefamilia = sobrenome[sobrenome.length - 1];
			if (nome.equalsIgnoreCase(nomefamilia)) {
				cont++;
			}
		}
		System.out.println("A quantidade de famílias que fazem parte é " + cont);
		teclado.close();
	}
}