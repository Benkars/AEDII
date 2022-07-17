import java.util.Scanner;

public class C13EX011 {
	public static void main(String[] args) {
		String nome, nomefamilia;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu nome completo: ");
		nome = teclado.nextLine();
		String[] sobrenome = nome.split(" ");
		nomefamilia = sobrenome[sobrenome.length - 2];
		nomefamilia = nomefamilia.toUpperCase();
		System.out.println(nomefamilia);
		teclado.close();
	}
}