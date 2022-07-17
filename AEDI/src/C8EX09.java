import java.util.Scanner;

public class C8EX09 {
	public static void main(String[] args) {
		String sexo, nome;
		int rep, idade, soma1 = 0, soma2 = 0, cont1 = 0, cont2 = 0;
		double mediaM, mediaF;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número de pessoas: ");
		rep = teclado.nextInt();
		teclado.nextLine();
		for (int aux = 1; aux <= rep; aux++) {
			System.out.print("Informe o nome do usuário: ");
			nome = teclado.nextLine();
			System.out.print("Informe a idade do usuário: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe o sexo do usuário: ");
			sexo = teclado.nextLine();
			if (sexo.equalsIgnoreCase("M")) {
				soma1 += idade;
				cont1++;
			} else {
				if (sexo.equalsIgnoreCase("F")) {
					soma2 += idade;
					cont2++;
				}
			}
		}
		mediaM = (float) soma1 / cont1;
		mediaF = (float) soma2 / cont2;
		System.out.println("A média das idades dos homens é de " + mediaM);
		System.out.println("A média das idades das mulheres é de " + mediaF);
		teclado.close();
	}

}
