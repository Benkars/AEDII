import java.util.Scanner;

public class fgerfGW {
	public static void main(String[] args) {
		int VET[ ] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int cont = 0; cont < VET.length; cont++) {
			System.out.print("Informe o nome compeleto do autor: ");
			VET[cont] = teclado.nextInt();
		}
		for (int cont = 0; cont < VET.length; cont++)
			System.out.println(VET);
		teclado.close();
	}
}
