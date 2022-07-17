import java.util.Scanner;

public class C12EX23 {
	public static void main(String[] args) {
		int[] vet = new int[10], divisivel = new int[10];
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < vet.length; aux++) {
			System.out.print("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int lux = 0; lux < vet.length; lux++) {
			if (vet[lux] % 3 == 0) {
				divisivel[cont] = vet[lux];
				cont++;
			}
		}
		System.out.println("O vetor dos números divisíveis por 3 é ");
		for (int aux = 0; aux < vet.length; aux++) {
			if (divisivel[aux] != 0)
			System.out.print(" " + divisivel[aux]);
		}
		teclado.close();
	}
}