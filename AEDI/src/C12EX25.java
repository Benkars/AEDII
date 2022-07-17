import java.util.Scanner;

public class C12EX25 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe uma frase curta: ");
		String frase = teclado.nextLine();
		String palavras[] = frase.split(" ");
		for (int aux = 0; aux < palavras.length; aux++)
			System.out.println(palavras[aux]);
		teclado.close();
	}
}