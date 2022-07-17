import java.util.Scanner;

public class C13EX10 {
	public static void main(String[] args) {
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		frase = teclado.nextLine();
		for (int cont = 0; cont < frase.length(); cont++) {
			System.out.println(frase.charAt(cont));
		}
		teclado.close();
	}
}