import java.util.Scanner;

public class C8EX19 {
	public static void main(String[] args) {
		double funcao = 0;
		long rep=0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos desejada: ");
		rep = teclado.nextLong();
		for (int aux = 0; aux <= rep - 1; aux++) {
			funcao = Math.pow(2,aux);
			soma += funcao;
			System.out.println(funcao);
		}
		System.out.println("A soma dos termos é igual a " + soma);
		teclado.close();
	}

}
