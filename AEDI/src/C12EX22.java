import java.util.Scanner;
import java.util.Arrays;

public class C12EX22 {
	public static void main(String[] args) {
		String placa[] = new String[100], nome[] = new String[100], nomePlaca;
		int pos, pos2;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < placa.length; aux++) {
			System.out.print("Informe a placa do carro: ");
			placa[aux] = teclado.nextLine();
			System.out.print("Informe o nome do dono da vaga: ");
			nome[aux] = teclado.nextLine();

		}
		System.out.print("Infome o nome ou a placa do carro do morador: ");
		nomePlaca = teclado.nextLine();
		pos = Arrays.binarySearch(placa, nomePlaca);
		pos2 = Arrays.binarySearch(nome, nomePlaca);
		if (pos < 0 && pos2 < 0)
			System.out.println("Informação não encontrada");
		else if (pos >= 0)
			System.out.println("Informação encontrada na posição " + (pos + 1));
		else
			System.out.println("Informação encontrada na posição " + (pos2 + 1));
		teclado.close();
	}
}