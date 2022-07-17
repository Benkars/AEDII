import java.util.Scanner;

public class C13EX08 {
	public static void main(String[] args) {
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome compeleto do autor: ");
		nome = teclado.nextLine();
		String[] sobrenome = nome.toUpperCase().split(" ");
		System.out.println(sobrenome[sobrenome.length - 1]);
		for (int cont = 0; cont < sobrenome.length - 1; cont++) {
			if (cont == 0) {
				System.out.print(sobrenome[sobrenome.length - 1] + ", ");
			}
			System.out.print(sobrenome[cont].charAt(0) + ". ");
		}
		teclado.close();
	}
}