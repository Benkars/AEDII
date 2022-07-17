import java.util.Scanner;

public class C13EX07 {
	public static void main(String[] args) {
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome completo: ");
		nome = teclado.nextLine();
		String[] sobrenome = nome.split(" ");
		System.out.println(sobrenome[sobrenome.length - 1]);
		teclado.close();
	}
}