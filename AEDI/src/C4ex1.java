import java.util.Scanner;

public class C4ex1 {
	public static void main(String[] args) {
		String primeiroNome, segundoNome, sobrenome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		primeiroNome = teclado.nextLine();
		System.out.print("Digite seu sobrenome: ");
		sobrenome = teclado.nextLine();
		System.out.print("Digite seu segundo nome: ");
		segundoNome = teclado.nextLine();
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		System.out.println(segundoNome + ", " + primeiroNome + " " + sobrenome);
		System.out.print("Idade: " + idade + " anos");
		teclado.close();
	}
}