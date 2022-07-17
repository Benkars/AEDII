import java.util.Scanner;

public class C13EX04 {
	public static void main(String[] args) {
		int tentativa, cont = 0;
		Scanner teclado = new Scanner(System.in);
		int correto = (int) Math.random() * 100;
		do {
			System.out.print("Informe o um núemro para saber se está acima ou abaixo do número aleatório: ");
			tentativa = teclado.nextInt();
			cont++;
			if (tentativa > correto)
				System.out.println("O número correto é menor que o informado");
			else if (tentativa < correto)
				System.out.println("O número correto é maior que o informado");
			else if (tentativa == correto)
				System.out.println("Parabéns você acertou !, foram necessárias " + cont + " tentativas");
		} while (tentativa != correto);
		teclado.close();
	}
}