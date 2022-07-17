import java.util.Scanner;

public class C13EX04 {
	public static void main(String[] args) {
		int tentativa, cont = 0;
		Scanner teclado = new Scanner(System.in);
		int correto = (int) Math.random() * 100;
		do {
			System.out.print("Informe o um n�emro para saber se est� acima ou abaixo do n�mero aleat�rio: ");
			tentativa = teclado.nextInt();
			cont++;
			if (tentativa > correto)
				System.out.println("O n�mero correto � menor que o informado");
			else if (tentativa < correto)
				System.out.println("O n�mero correto � maior que o informado");
			else if (tentativa == correto)
				System.out.println("Parab�ns voc� acertou !, foram necess�rias " + cont + " tentativas");
		} while (tentativa != correto);
		teclado.close();
	}
}